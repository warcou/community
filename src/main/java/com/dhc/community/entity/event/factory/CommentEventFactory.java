package com.dhc.community.entity.event.factory;

import com.dhc.community.constant.EventConstant;
import com.dhc.community.entity.DTO.EntityDTO;
import com.dhc.community.entity.event.CommentEvent;
import com.dhc.community.entity.event.Event;
import org.springframework.stereotype.Component;

@Component
public class CommentEventFactory implements EventFactory, EventConstant {
    @Override
    public Event produce(Integer userId, EntityDTO entityDTO) {
        return CommentEvent.builder()
                .topic(TOPIC_COMMENT)
                .entityType(entityDTO.getType())
                .userId(userId)
                .entityId(entityDTO.getId())
                .entityUserId(entityDTO.getUserId())
                .build();
    }
}
