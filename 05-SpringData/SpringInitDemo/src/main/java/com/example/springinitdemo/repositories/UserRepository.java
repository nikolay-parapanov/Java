package com.example.springinitdemo.repositories;

import com.example.springinitdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Option<User> findbyUsername(String username);
}
