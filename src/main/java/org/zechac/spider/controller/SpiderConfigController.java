package org.zechac.spider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/24.
 */
@RestController
@RequestMapping("api/spider")
public class SpiderConfigController {

    @RequestMapping("test")
    public ResponseEntity test(){
        return ResponseEntity.ok("success");
    }
}
