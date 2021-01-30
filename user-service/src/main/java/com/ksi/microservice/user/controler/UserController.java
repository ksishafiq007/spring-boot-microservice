package com.ksi.microservice.user.controler;

import com.ksi.microservice.user.VO.ResponseTemplateVO;
import com.ksi.microservice.user.entity.User;
import com.ksi.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
       //log.ingo("Inside save user of UserController")
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        //log.ingo("Inside getUserWithDepartment of UserController")
        return userService.getUserWithDepartment(userId);
    }
}
