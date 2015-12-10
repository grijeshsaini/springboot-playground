package com.grijesh.springboot.presentation.domain;

/**
 * Created by grijesh on 11/12/15.
 */
public class EventMessage {

    private String event;

    public EventMessage() {
    }

    public EventMessage(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
