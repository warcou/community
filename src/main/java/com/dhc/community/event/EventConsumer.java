package com.dhc.community.event;

import com.alibaba.fastjson.JSONObject;
import com.dhc.community.constant.KafkaConstant;
import com.dhc.community.entity.event.LikeEvent;
import com.dhc.community.entity.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


@Component
public class EventConsumer implements KafkaConstant {

    private static final Logger logger = LoggerFactory.getLogger(EventConsumer.class);
    @Autowired
    private MessageService messageService;

    @KafkaListener(topics = {TOPIC_COMMENT,TOPIC_FOLLOW,TOPIC_LIKE})
    public void handleMessage(ConsumerRecord record){
        if(record == null||record.value() == null){
            logger.error("消息为空");
            return;
        }

        LikeEvent event = JSONObject.parseObject(record.value().toString(), LikeEvent.class);
        if(event == null){
            logger.error("消息格式错误");
            return;
        }
        //todo: 发送站内通知
        System.out.println(event);
        Message message = Message.builder()
                .fromId(SYSTEM_USER_ID)
                .toId(event.getEntityUserId())
                .conversationId(event.getTopic())
                .createdAt(LocalDate.now())
                .build();
        Map<String,Object> content = new HashMap<>();
        content.put("userId",event.getUserId());
        content.put("entityType",event.getEntityType());
        content.put("entityId",event.getEntityId());
        if(event.getData()!=null){
            content.putAll(event.getData());
        }
        message.setContent(JSONObject.toJSONString(content));
        messageService.addSystemMessage(message);

    }
}
