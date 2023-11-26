package com.pathfinder.model.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {
    @NotNull
    @Size(min = 5, max = 20)
    private String username;
    @NotNull
    @Size(min = 5, max = 20)
    private String fullname;
    @NotNull
    @Email
    private String email;
    @Min(0)
    @Max(90)
    private int age;
    @NotNull
    @Size(min = 5, max = 20)
    private String password;
    @NotNull
    @Size(min = 5, max = 20)
    private String confirmPassword;

    public UserRegistrationDTO() {
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
