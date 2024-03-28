package com.dhc.community.controller;

import com.dhc.community.entity.DTO.EntityDTO;
import com.dhc.community.event.EventProducer;
import com.dhc.community.service.EventService;
import com.dhc.community.service.MessageService;
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
