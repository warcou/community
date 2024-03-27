package com.dhc.community.controller;

import com.dhc.community.entity.DTO.UserDTO;
import com.dhc.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Integer register(@RequestBody UserDTO userDTO){
        return userService.registerUser(userDTO);
    }
}
