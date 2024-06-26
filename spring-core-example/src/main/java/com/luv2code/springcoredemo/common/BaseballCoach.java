package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) we an change the scope of the bean with this annotation, By Default scope of the Bean is Singletion
// Spring will not take care of prototype bean
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
