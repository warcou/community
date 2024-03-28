package com.dhc.community.entity.event;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
public class FollowEvent implements Event{
    private String topic;
    private int userId;
    private int entityId;
    private int entityType;
    private int entityUserId;
    private Map<String,Object> data = new HashMap<>();

    public FollowEvent addData(String key, Object value){
        this.data.put(key,value);
        return this;
    }
    public String getTopic() {
        return topic;
    }
}
