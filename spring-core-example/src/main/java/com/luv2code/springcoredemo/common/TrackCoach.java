package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
// @Lazy  this class will not instanstiate on the startUp of SpringBoot container It's instance will create whenever it is required
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
