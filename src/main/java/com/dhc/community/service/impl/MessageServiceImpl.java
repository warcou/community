package com.dhc.community.service.impl;

import com.dhc.community.dao.MessageMapper;
import com.dhc.community.entity.Message;
import com.dhc.community.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public Integer addSystemMessage(Message message) {
        return messageMapper.insertMessage(message)?message.getId():-1;
    }
}
