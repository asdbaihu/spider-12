package org.zechac.spider.controller.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zechac.spider.service.socket.TestWebSocketHandler;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
@RequestMapping("api/socket")
public class TestController {

    @Autowired
    private TestWebSocketHandler testWebSocketHandler;

    @RequestMapping("send")
    public ResponseEntity test(){
        testWebSocketHandler.send("success");
        return ResponseEntity.ok("ok");
    }

}
