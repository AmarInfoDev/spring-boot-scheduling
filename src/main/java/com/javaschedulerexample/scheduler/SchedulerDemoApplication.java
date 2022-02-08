package com.javaschedulerexample.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SchedulerDemoApplication {

    Logger logger= LoggerFactory.getLogger(SchedulerDemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SchedulerDemoApplication.class, args);
    }

    @Scheduled(fixedRate = 2000L)
//    @Scheduled(fixedDelay = 2000L)
//    @Scheduled(fixedDelay = 2000L, initialDelay = 2000L)
//    @Scheduled(fixedDelayString = "PT2S")
//    @Scheduled(cron = "*/2 * * * * *")
    public void task() throws InterruptedException {

        logger.info("Task current time:" + new Date());
        Thread.sleep(1000L);

    }

}
