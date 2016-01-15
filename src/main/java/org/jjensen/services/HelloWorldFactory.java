package org.jjensen.services;

/**
 * Created by jpjense3 on 1/15/2016.
 */
public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;

        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            default:
                service = new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
