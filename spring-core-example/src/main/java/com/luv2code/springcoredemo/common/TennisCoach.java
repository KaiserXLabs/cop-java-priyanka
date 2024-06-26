package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Primary if you doesn't use qualifier to specify which type of bean required during constructor or setting injection then this will go as promary implementation
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
