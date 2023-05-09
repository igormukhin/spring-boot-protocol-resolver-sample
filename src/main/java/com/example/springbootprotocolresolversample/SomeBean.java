package com.example.springbootprotocolresolversample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    @Value("${greeting}")
    private Resource greeting;

    public Resource getGreeting() {
        return greeting;
    }

    public void setGreeting(Resource greeting) {
        this.greeting = greeting;
    }


}
