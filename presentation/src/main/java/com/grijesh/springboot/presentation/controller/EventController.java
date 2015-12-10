package com.grijesh.springboot.presentation.controller;

import com.grijesh.springboot.presentation.domain.EventMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by grijesh on 11/12/15.
 */
@Controller
public class EventController {

    @MessageMapping("/event")
    @SendTo("/topic/events")
    public EventMessage events(EventMessage message) throws Exception {
        return new EventMessage(message.getEvent());
    }
}
