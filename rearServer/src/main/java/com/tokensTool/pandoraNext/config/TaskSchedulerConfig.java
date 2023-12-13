package com.tokensTool.pandoraNext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @author Yangyang
 * @create 2023-10-22 10:00
 */
@Configuration
public class TaskSchedulerConfig {
    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        // 设置线程池大小
        taskScheduler.setPoolSize(10);
        // 设置线程名称前缀
        taskScheduler.setThreadNamePrefix("TaskScheduler-Thread-");
        return taskScheduler;
    }

}

