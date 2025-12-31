package com.example.abhinav.annotation.config;

import com.example.abhinav.annotation.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // this was not supposed to be commented in last commit but thats okay
public class MyConfig {

    @Bean
    public ProductService productService(){
        return new ProductService();
    }
}

