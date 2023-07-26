package com.SpringGuide.demo.Scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 50000)
    public void printHello(){
        System.out.println("The time is now: " + dateFormat.format(new Date()));
    }
}
