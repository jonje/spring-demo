package org.jjensen.config;

import org.jjensen.services.HelloWorldService;
import org.jjensen.services.HelloWorldServiceEnglishImpl;
import org.jjensen.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jpjense3 on 1/15/2016.
 */
@Configuration
public class HelloConfig {
    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}
