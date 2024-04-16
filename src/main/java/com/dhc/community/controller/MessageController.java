package com.dhc.community.controller;

import com.dhc.community.entity.DTO.EntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class MessageController {
    @Autowired
    EventService eventService;
    @PostMapping("/like")
    public void like(@RequestBody EntityDTO entityDTO){
        eventService.createNSendLikeEvent(1,entityDTO);
    }
}
