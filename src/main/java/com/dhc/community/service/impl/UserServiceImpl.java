package com.dhc.community.service.impl;

import com.dhc.community.dao.UserMapper;
import com.dhc.community.entity.DTO.UserDTO;
import com.dhc.community.entity.User;
import com.dhc.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Integer registerUser(UserDTO userDTO) {
        User user = User.builder().username(userDTO.getUsername()).password(userDTO.getPassword()).build();
        userMapper.registerUser(user);
        return user.getId();
    }
}
