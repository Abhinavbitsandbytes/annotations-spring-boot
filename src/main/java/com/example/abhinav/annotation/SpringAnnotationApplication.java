package com.example.abhinav.annotation;

import com.example.abhinav.annotation.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationApplication {

	public static void main(String[] args)
	{
	ConfigurableApplicationContext container = SpringApplication.run(SpringAnnotationApplication.class, args);
	ProductService productService =	container.getBean(ProductService.class);
	System.out.println(productService);
	productService.createProduct();
	}

	// we have created a sibling package named config where we have created a class MyConfig
	// and annotated it with @Configuration
	// when we run the app - Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.example.abhinav.annotation.services.ProductService' available
	// this is because spring boot by default scans only the current package and its sub packages
	// to make it scan the sibling package also we can use @ComponentScan annotation on the main application class
	// @ComponentScan(basePackages = {"com.example.abhinav.annotation.config","com.example.abhinav.annotation.services"})


}
