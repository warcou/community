package com.dhc.community.service;

import com.dhc.community.entity.DTO.EntityDTO;

public interface EventService {
    void createNSendLikeEvent(Integer userId, EntityDTO entityDTO);
    void createNSendFollowEvent(Integer userId, EntityDTO entityDTO);
    void createNSendCommentEvent(Integer userId, EntityDTO entityDTO);
}
