package com.example.springbootprotocolresolversample;


import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ProtocolResolverSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtocolResolverSampleApplication.class, args);
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new Base64ProtocolResolverConfigurer();
    }
}
