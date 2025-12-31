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

