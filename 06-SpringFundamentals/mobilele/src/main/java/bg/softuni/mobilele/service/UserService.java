package bg.softuni.mobilele.service;

import bg.softuni.mobilele.model.entity.UserEntity;
import bg.softuni.mobilele.model.dto.UserLoginDTO;
import bg.softuni.mobilele.model.dto.UserRegisterDTO;
import bg.softuni.mobilele.model.mapper.UserMapper;
import bg.softuni.mobilele.repositories.UserRepository;
import bg.softuni.mobilele.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;
    private final CurrentUser currentUser;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository,
                       CurrentUser currentUser,
                       PasswordEncoder passwordEncoder,
                       UserMapper userMapper) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO) {

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        this.userRepository.save(newUser);
        login(newUser);
    }

    public boolean login(UserLoginDTO loginDTO) {
        Optional<UserEntity> userOpt = userRepository.
                findByEmail(loginDTO.getUsername());

        if (userOpt.isEmpty()) {
            LOGGER.info("User with name [{}] not found.", loginDTO.getUsername());
            return false;
        }

        var rawPassword = loginDTO.getPassword();
        var encodedPassword = userOpt.get().getPassword();

        boolean success = passwordEncoder.matches(rawPassword, encodedPassword);

        if (success) {
            login(userOpt.get());
        } else {
            logout();
        }

        return success;
    }

    private void login(UserEntity userEntity) {
        currentUser.
                setLoggedIn(true).
                setName(userEntity.getFirstName() + " " + userEntity.getLastName());
    }

    public void logout() {
        currentUser.clear();
    }
}
