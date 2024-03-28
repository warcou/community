package com.dhc.community.dao;

import com.dhc.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    Boolean insertMessage(Message message);
}
