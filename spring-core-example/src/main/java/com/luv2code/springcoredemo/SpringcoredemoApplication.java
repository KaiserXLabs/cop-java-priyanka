package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Define
@SpringBootApplication(
scanBasePackages = {"com.luv2code.springcoredemo",
                    "com.luv2code.util"})
*/
@SpringBootApplication   //@EnableAutoConfiguration, @ComponentScan ,@Configuration(Combination of these Annotation)
public class SpringcoredemoApplication {

	public static void main(String[] args) {

       SpringApplication.run(SpringcoredemoApplication.class);
	}
	}

