package org.zechac.spider.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;
import org.zechac.spider.service.socket.TestWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConf implements WebSocketConfigurer {

    @Autowired
    private TestWebSocketHandler testWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(testWebSocketHandler, "/api/socket");
    }

}
