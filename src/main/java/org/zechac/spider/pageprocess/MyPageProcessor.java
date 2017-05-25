package org.zechac.spider.pageprocess;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by Administrator on 2017/5/24.
 */
public class MyPageProcessor implements PageProcessor{
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("(https://baidu\\.com/\\w+/\\w+)").all());
        page.putField("page", page.getHtml().toString());
    }

    @Override
    public Site getSite() {
        return site;
    }
}
