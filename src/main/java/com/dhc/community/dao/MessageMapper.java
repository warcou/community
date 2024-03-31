package com.dhc.community.dao;

import com.dhc.community.entity.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    /**
     * 新增一条通知
     * */
    Boolean insertMessage(Message message);
    /**
     * 查询某个主题下的最新通知
     * */
    Message selectLatestNotice(int userId,String topic);
    /**
     * 查询某个主题的总通知数量
     * */
    Integer selectNoticeCount(int userId,String topic);
    /**
     * 查询未读的通知的数量
     * */
    Integer selectNoticeUnreadCount(int userId,String topic);
}
