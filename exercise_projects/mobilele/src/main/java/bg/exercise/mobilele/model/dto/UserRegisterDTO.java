package bg.exercise.mobilele.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegisterDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String password ;
    private String confirmPassword ;
}
