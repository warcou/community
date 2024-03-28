package com.dhc.community.service.impl;

import com.dhc.community.entity.DTO.EntityDTO;
import com.dhc.community.entity.event.Event;
import com.dhc.community.entity.event.factory.CommentEventFactory;
import com.dhc.community.entity.event.factory.FollowEventFactory;
import com.dhc.community.entity.event.factory.LikeEventFactory;
import com.dhc.community.event.EventProducer;
import com.dhc.community.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventProducer eventProducer;
    @Autowired
    LikeEventFactory likeEventFactory;
    @Autowired
    FollowEventFactory followEventFactory;
    @Autowired
    CommentEventFactory commentEventFactory;
    @Override
    public void createNSendLikeEvent(Integer userId, EntityDTO entityDTO) {
        eventProducer.fireEvent(likeEventFactory.produce(userId, entityDTO));
    }

    @Override
    public void createNSendFollowEvent(Integer userId, EntityDTO entityDTO) {
        eventProducer.fireEvent(followEventFactory.produce(userId,entityDTO));
    }

    @Override
    public void createNSendCommentEvent(Integer userId, EntityDTO entityDTO) {
        eventProducer.fireEvent(commentEventFactory.produce(userId,entityDTO));
    }
}
