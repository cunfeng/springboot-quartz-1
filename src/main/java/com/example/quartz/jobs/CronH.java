package com.example.quartz.jobs;

import com.example.quartz.service.BaseJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by haoxy on 2018/9/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class CronH implements BaseJob{

    private static Logger log = LoggerFactory.getLogger(CronH.class);

    public CronH() {

    }
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("CronH执行时间: " + new Date());
    }
}

