package com.hutool.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务测试
 */
@Component
@EnableScheduling
public class SynTask implements Runnable{

    private static Logger logger = LoggerFactory.getLogger(SynTask.class);

//    @Scheduled(cron = "0/3 * * * * ?")//每隔3秒
    @Scheduled(cron = "0 0/1 * * * ?")//每隔1分
    @Override
    public void run() {
        System.out.println("================xxx同步开始==================");
        logger.info("每隔1分");
        System.out.println("================xxx同步结束==================");
    }
}


