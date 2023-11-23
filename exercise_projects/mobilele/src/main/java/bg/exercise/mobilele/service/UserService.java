package bg.exercise.mobilele.service;

import bg.exercise.mobilele.model.dto.UserLoginDTO;
import bg.exercise.mobilele.model.entity.UserEntity;
import bg.exercise.mobilele.model.repository.UserRepository;
import bg.exercise.mobilele.user.CurrentUser;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Setter
@Getter
@Service
public class UserService {
    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;
    private CurrentUser currentUser;

    public UserService(UserRepository userRepository, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    public boolean login(UserLoginDTO loginDTO) {
        Optional<UserEntity> userOpt = userRepository
                .findByEmail(loginDTO.getUsername());

        if (userOpt.isEmpty()) {
            LOGGER.debug("User with name [{}] not found", loginDTO.getUsername());
            return false;
        }

        boolean success =  userOpt.get().getPassword().equals(loginDTO.getPassword());

        if (success) {
            login(userOpt.get());
        } else {
            logout();
        }

        return success;

    }

    public void login(UserEntity userEntity){
        currentUser.setLoggedIn(true);
        currentUser.setName(userEntity.getFirstName() + " "+ userEntity.getLastName());

    }


    public void logout() {
        currentUser.clear();
    }
    }
