package com.example.abhinav.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myconfig.properties")  // we need to add here to tell the app which properties to load. by default it loads application properties. we can register anywhere i.e to any file which has @Congiguration
@ComponentScan("working")
// @ComponentScan(basePackages = {"working","any.other.package.to.scan"}) // preferred way to add multiple packages to scan
public class AppConfig {
}
