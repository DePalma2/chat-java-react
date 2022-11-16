package com.chat.controller;

import com.chat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    @SendTo("/room/public")
    private Message receiverMessage(@Payload Message message) {
        return message;
    }

    @MessageMapping("/message_private")
    public Message receiveMessagePrivate (@Payload Message message) {
        messagingTemplate.convertAndSendToUser(message.getReceiver(), "/private", message);
        return message;
    }

}
