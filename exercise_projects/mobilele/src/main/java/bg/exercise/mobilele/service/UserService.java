package bg.exercise.mobilele.service;

import bg.exercise.mobilele.model.dto.UserLoginDTO;
import bg.exercise.mobilele.model.dto.UserRegisterDTO;
import bg.exercise.mobilele.model.entity.UserEntity;
import bg.exercise.mobilele.model.repository.UserRepository;
import bg.exercise.mobilele.user.CurrentUser;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Setter
@Getter
@Service
public class UserService {
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private UserRepository userRepository;
    private CurrentUser currentUser;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       CurrentUser currentUser,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean login(UserLoginDTO loginDTO) {
        Optional<UserEntity> userOpt = userRepository.findByEmail(loginDTO.getUsername());

        if (userOpt.isEmpty()) {
            LOGGER.debug("User with name [{}] not found", loginDTO.getUsername());
            return false;
        }

        String rawPassword =loginDTO.getPassword();
        String encodedPassword = userOpt.get().getPassword();

        boolean success = passwordEncoder.matches(rawPassword, encodedPassword);

        if (success) {
            login(userOpt.get());
        } else {
            logout();
        }

        return success;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO){
        UserEntity newUser =
                new UserEntity();

        newUser.setActive(true);
        newUser.setEmail(userRegisterDTO.getEmail());
        newUser.setFirstName(userRegisterDTO.getFirstName());
        newUser.setLastName(userRegisterDTO.getLastName());
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        newUser = userRepository.save(newUser);

        login(newUser);

    }

    public void login(UserEntity userEntity) {
        currentUser.setLoggedIn(true);
        currentUser.setName(userEntity.getFirstName() + " " + userEntity.getLastName());
    }

    public void logout() {
        currentUser.clear();
    }


}
