package com.dhc.community.entity.event;
public interface Event {
    Event addData(String key, Object value);

    String getTopic();
}
