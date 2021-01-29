package com.ksi.microservice.user.service;

import com.ksi.microservice.user.entity.User;
import com.ksi.microservice.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        //log.ingo("Inside save user of UserService")
        return userRepository.save(user);
    }
}
