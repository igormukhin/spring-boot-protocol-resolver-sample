package com.example.springbootprotocolresolversample;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

@SpringBootTest
public class SomeBeanTest {

    @Autowired
    private SomeBean someBean;

    @Test
    public void testBase64ProtocolProperty() {
        // when
        String greetingStr = resourceToString(someBean.getGreeting());

        // then
        assertThat(greetingStr).isEqualTo("Hello, World!");
    }

    private static String resourceToString(Resource resource) {
        try (var in = resource.getInputStream()) {
            return new String(in.readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
