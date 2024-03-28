package com.dhc.community.entity.event.factory;

import com.dhc.community.constant.EventConstant;
import com.dhc.community.entity.DTO.EntityDTO;
import com.dhc.community.entity.event.Event;
import com.dhc.community.entity.event.FollowEvent;
import org.springframework.stereotype.Component;

@Component
public class FollowEventFactory implements EventFactory, EventConstant {

    @Override
    public Event produce(Integer userId, EntityDTO entityDTO) {
        return FollowEvent.builder()
                .topic(TOPIC_FOLLOW)
                .entityType(entityDTO.getType())
                .userId(userId)
                .entityId(entityDTO.getId())
                .entityUserId(entityDTO.getUserId())
                .build();
    }
}
