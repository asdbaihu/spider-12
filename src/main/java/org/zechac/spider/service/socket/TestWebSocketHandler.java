package org.zechac.spider.service.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */
@Slf4j
@Service
public class TestWebSocketHandler extends TextWebSocketHandler {

    List<WebSocketSession> webSocketSessions=new ArrayList<>();

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        log.info(message.toString());
        webSocketSessions.add(session);
    }


    public void send(String text){
        WebSocketMessage webSocketMessage=new TextMessage(text);
        for(WebSocketSession webSocketSession:webSocketSessions){
            try {
                webSocketSession.sendMessage(webSocketMessage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
