package com.dhc.community.event;

import com.alibaba.fastjson.JSONObject;
import com.dhc.community.entity.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EventProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void fireEvent(Event event){
        System.out.println(event+"fire");
        kafkaTemplate.send(event.getTopic(), JSONObject.toJSONString(event));
    }
}
