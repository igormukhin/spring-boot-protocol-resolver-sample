package com.example.springbootprotocolresolversample;


import java.util.Base64;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

class Base64ProtocolResolver implements ProtocolResolver {

    private static final String PREFIX = "base64:";
    private static final int PREFIX_LENGTH = PREFIX.length();

    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {
        if (location.startsWith(PREFIX)) {
            var encoded = location.substring(PREFIX_LENGTH);
            return new ByteArrayResource(Base64.getDecoder().decode(encoded));
        }

        return null;
    }
}
