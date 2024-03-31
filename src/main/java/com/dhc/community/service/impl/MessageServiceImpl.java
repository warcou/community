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

    @Override
    public Message findLatestNotice(int userId, String topic) {
        return messageMapper.selectLatestNotice(userId,topic);
    }

    @Override
    public Integer findNoticeCount(int userId, String topic) {
        return messageMapper.selectNoticeCount(userId,topic);
    }

    @Override
    public Integer findNoticeUnreadCount(int userId, String topic) {
        return messageMapper.selectNoticeUnreadCount(userId, topic);
    }
}
