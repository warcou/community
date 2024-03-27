package com.dhc.community.dao;

import com.dhc.community.entity.DTO.UserDTO;
import com.dhc.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Boolean registerUser(User user);
}
