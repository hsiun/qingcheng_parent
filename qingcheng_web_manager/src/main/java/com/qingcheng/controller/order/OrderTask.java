package com.qingcheng.controller.order;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2020-01-23 21:09
 */

@Component
public class OrderTask {

    @Scheduled(cron = "* * * * * ?")
    public void task() {
        System.out.println(new Date());
    }
}
