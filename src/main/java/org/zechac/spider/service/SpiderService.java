package org.zechac.spider.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zechac.spider.service.socket.TestWebSocketHandler;

/**
 * Created by Administrator on 2017/5/24.
 */
@Service
@Slf4j
public class SpiderService {

    @Autowired
    private TestWebSocketHandler testWebSocketHandler;

    public void startSpider(){

    }
}
