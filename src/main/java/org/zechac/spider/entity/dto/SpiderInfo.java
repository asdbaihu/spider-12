package org.zechac.spider.entity.dto;

import lombok.Data;
import us.codecraft.webmagic.Spider;

import java.time.DateTimeException;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class SpiderInfo {

    private String name;
    private Date createTime;

    private Spider spider;
}
