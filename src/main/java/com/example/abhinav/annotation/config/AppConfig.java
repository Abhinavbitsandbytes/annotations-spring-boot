package com.example.abhinav.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("working")
// @ComponentScan(basePackages = {"working","any.other.package.to.scan"}) // preferred way to add multiple packages to scan
public class AppConfig {
}
