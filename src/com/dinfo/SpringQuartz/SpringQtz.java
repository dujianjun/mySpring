package com.dinfo.SpringQuartz;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-01-29  13:28  星期一
 * version 1.0
 */
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

public class SpringQtz extends QuartzJobBean{
    private static int counter = 0;
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println();
        long ms = System.currentTimeMillis();
        System.out.println("\t\t" + new Date(ms));
        System.out.println(ms);
        System.out.println("(" + counter++ + ")");
        String s = (String) context.getMergedJobDataMap().get("service");
        System.out.println(s);
        System.out.println();
    }
}