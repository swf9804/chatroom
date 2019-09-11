package com.example.websocket.chatroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author SWF
 * @date 2019/9/9 23:47
 **/
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * 注册websocket端点,客户端将使用它连接websocket服务器
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
       // registry.enableSimpleBroker("/topic");
        registry.enableStompBrokerRelay("/topic")
                .setRelayHost("127.0.0.1")
                .setRelayPort(5672)
                .setClientLogin("guest")
                .setClientPasscode("guest");
    }
}
