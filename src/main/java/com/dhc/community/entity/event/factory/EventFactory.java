package com.dhc.community.entity.event.factory;

import com.dhc.community.entity.DTO.EntityDTO;
import com.dhc.community.entity.event.Event;

public interface EventFactory {
    Event produce(Integer userId, EntityDTO entityDTO);
}
