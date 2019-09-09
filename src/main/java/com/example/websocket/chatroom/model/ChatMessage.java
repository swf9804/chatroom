package com.example.websocket.chatroom.model;

/**
 * @author SWF
 * @date 2019/9/9 23:58
 **/
public class ChatMessage {
    // 消息类型
    private MessageType type;
    // 内容
    private String content;
    // 发送者
    private String sender;

    public enum MessageType{
        // 消息
        CHAT,
        // 加入
        JOIN,
        // 离开
        LEAVE;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
