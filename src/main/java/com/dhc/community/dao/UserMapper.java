package com.dhc.community.dao;

import com.dhc.community.entity.DTO.UserDTO;
import com.dhc.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Boolean registerUser(User user);
    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insertUser(int id, int status);
    int updateHeader(int id, String headerUrl);
    int updatePassword(int id, String password);
}
