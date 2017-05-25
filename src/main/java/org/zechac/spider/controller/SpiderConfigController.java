package org.zechac.spider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zechac.spider.entity.dto.SpiderInfo;
import org.zechac.spider.service.SpiderService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
@RequestMapping("api/spider")
public class SpiderConfigController {

    @Autowired
    private SpiderService spiderService;

    @RequestMapping("test")
    public ResponseEntity test(){
        return ResponseEntity.ok("success");
    }

    @RequestMapping("start")
    public ResponseEntity start(){
        spiderService.start();
        return ResponseEntity.ok().build();
    }

    @RequestMapping("list")
    public ResponseEntity list(){
        List<SpiderInfo> spiderInfos=spiderService.listActiveSpider();
        return ResponseEntity.ok().build();
    }

    @RequestMapping("stop")
    public ResponseEntity stop(String name){
        spiderService.stop(name);
        return ResponseEntity.ok().build();
    }
}
