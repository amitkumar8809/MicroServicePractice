package com.amit.MicroServicePractice.Controller;

import com.amit.MicroServicePractice.ServiceImpl.UserServiceImpl;
import com.amit.MicroServicePractice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCOntroller {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userServiceImpl.getUser(userId);

    }
}
