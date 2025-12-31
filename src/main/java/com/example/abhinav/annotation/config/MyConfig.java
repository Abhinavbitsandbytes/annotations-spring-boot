package com.example.abhinav.annotation.config;

import com.example.abhinav.annotation.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig {

    @Bean
    public ProductService productService(){
        return new ProductService();
    }
}

// if we comment out @Configuration annotation above, then Spring will not treat this class as a configuration class
// and the bean defined inside it will not be created and managed by the Spring container.
// Error - Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.abhinav.annotation.services.ProductService' available

// Similarly, if we comment out @Bean annotation above the productService() method, then Spring will not create
// and manage the ProductService bean.
