package com.feri.webmagic.process;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/9 19:02
 */
public class CSDNProcess implements PageProcessor {
    private Site site=Site.me();
    public void process(Page page) {
        //获取文章的标题
        List<String> titles=page.getHtml().xpath("div[@class='article-item-box']/h4/a/text()").all();
        //获取文章摘要
        List<String> contents=page.getHtml().xpath("div[@class='article-item-box']/p[@class='content']/a/text()").all();
        //获取时间
        List<String> dates=page.getHtml().xpath("div[@class='article-item-box']/div[@class='info-box']/p[1]/span[@class='date']/text()").all();
        //获取阅读量
        List<String> reads=page.getHtml().xpath("div[@class='article-item-box']/div[@class='info-box']/p[2]/span[@class='read-num']/text()").all();
        //获取评论
        List<String> comments=page.getHtml().xpath("div[@class='article-item-box']/div[@class='info-box']/p[3]/span[@class='read-num']/text()").all();
        for(int i=0;i<titles.size();i++){
            System.err.println("标题："+titles.get(i));
            System.err.println("摘要："+contents.get(i));
            System.err.println("时间："+dates.get(i));
            System.err.println("阅读："+reads.get(i));
            System.err.println("评论："+comments.get(i));
        }
    }
    public Site getSite() {
        return site;
    }
}
