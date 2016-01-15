package org.jjensen.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jpjense3 on 1/14/2016.
 */
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
