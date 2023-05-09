# Spring Boot Protocol Resolver Sample

This sample demonstrates how to use a custom protocol resolver with Spring Boot.

Register a custom protocol resolver that can resolve resource contents from a base64 encoded string:
```java
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new Base64ProtocolResolverConfigurer();
    }
```
