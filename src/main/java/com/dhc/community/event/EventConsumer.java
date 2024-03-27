package com.dhc.community.event;

import com.alibaba.fastjson.JSONObject;
import com.dhc.community.constant.KafkaConstant;
import com.dhc.community.entity.Event;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class EventConsumer implements KafkaConstant {

    private static final Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    @KafkaListener(topics = {TOPIC_COMMENT,TOPIC_FOLLOW,TOPIC_LIKE})
    public void handleMessage(ConsumerRecord record){
        if(record == null||record.value() == null){
            logger.error("消息为空");
            return;
        }

        Event event = JSONObject.parseObject(record.value().toString(), Event.class);
        if(event == null){
            logger.error("消息格式错误");
            return;
        }
        //todo: 发送站内通知
        System.out.println(event);
    }
}
