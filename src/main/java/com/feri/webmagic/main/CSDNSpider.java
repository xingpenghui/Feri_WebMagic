package com.feri.webmagic.main;

import com.feri.webmagic.process.CSDNProcess;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 *@Author feri
 *@Date Created in 2018/10/9 19:04
 */
public class CSDNSpider {
    public static void main(String[] args) {
        new Spider(new CSDNProcess()).
                addUrl("https://blog.csdn.net/xingfei_work").
                addPipeline(new ConsolePipeline()).run();
    }
}
