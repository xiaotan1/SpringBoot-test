package com.example.bootvue3.controller;

import com.example.bootvue3.domain.Chat;
import com.example.bootvue3.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class GreetingController {

    /*@MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception {
        return message;
    }*/

    @Autowired
    SimpMessagingTemplate messagingTemplate;
    @MessageMapping ("/hello")
    public void greeting(Message message) throws Exception {
        messagingTemplate.convertAndSend ("/topic/greetings", message);
    }

    @MessageMapping ("/chat" )
    public void chat(Principal principal , Chat chat) {
        String from = principal.getName();
        chat.setFrom(from);
        messagingTemplate .convertAndSendToUser(chat.getTo(),
                "/queue/chat",chat);
    }
}
