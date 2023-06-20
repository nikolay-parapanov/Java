package com.example.springinitdemo.services;

import com.example.springinitdemo.models.User;
import com.example.springinitdemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public void register(String username, int age) {
        //Validate username+age
        if (username.isBlank() || age < 18) {
            throw new RuntimeException("Validation failed.");
        }

        //Check username is unique
        Option<User> byUsername = this.userRepository.findbyUsername(username);


        //Add default account
        //Save user

    }
}
