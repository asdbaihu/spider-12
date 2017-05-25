package org.zechac.spider.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.zechac.spider.entity.dto.SpiderInfo;
import org.zechac.spider.pageprocess.MyPageProcessor;
import org.zechac.spider.service.socket.TestWebSocketHandler;
import us.codecraft.webmagic.Spider;

import java.util.*;

/**
 * Created by Administrator on 2017/5/24.
 */
@Service
@Slf4j
public class SpiderService {

    @Autowired
    private TestWebSocketHandler testWebSocketHandler;

    Map<String,SpiderInfo> spiderMap=new HashedMap();

    public void start(){
       Spider spider= Spider.create(new MyPageProcessor());
       SpiderInfo spiderInfo=new SpiderInfo();
       spiderInfo.setCreateTime(new Date());
       spiderInfo.setName(UUID.randomUUID().toString().replace("-",""));
       spiderInfo.setSpider(spider);
       spiderMap.put(spiderInfo.getName(),spiderInfo);
       spider.addUrl("http://news.baidu.com/").thread(5).run();
    }

    public void stop(String name){
        if(StringUtils.isNotBlank(name)&&spiderMap.containsKey(name)){
            SpiderInfo spider=spiderMap.get(name);
            spider.getSpider().stop();
            spiderMap.remove(name);
        }else {
            throw new RuntimeException(String.format("未找到名称为%s的spider",name));
        }

    }

    public List<SpiderInfo> listActiveSpider(){
        List<SpiderInfo> spiderInfos=new ArrayList<>();
        spiderMap.forEach((d,v)->spiderInfos.add(v));
        return spiderInfos;
    }
}
