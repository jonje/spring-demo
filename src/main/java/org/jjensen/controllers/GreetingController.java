package org.jjensen.controllers;

import org.jjensen.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jpjense3 on 1/14/2016.
 */
//@Controller
public class GreetingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceSpanish;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceSpanish(HelloWorldService helloWorldServiceSpanish) {
        this.helloWorldServiceSpanish = helloWorldServiceSpanish;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        String greetingSpanish = helloWorldServiceSpanish.getGreeting();
        System.out.println(greeting);
        System.out.println(greetingSpanish);
        return greeting;
    }
}
