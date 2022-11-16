package com.chat.model;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private String time;
    private Status status;

    public Message() {}

    public Message(String sender, String receiver, String content, String time, Status status) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.time = time;
        this.status = status;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", status=" + status +
                '}';
    }
}
