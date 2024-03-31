package com.dhc.community.service;

import com.dhc.community.entity.Message;

public interface MessageService {
    Integer addSystemMessage(Message message);
    Message findLatestNotice(int userId,String topic);
    Integer findNoticeCount(int userId,String topic);
    Integer findNoticeUnreadCount(int UserId,String topic);
}
