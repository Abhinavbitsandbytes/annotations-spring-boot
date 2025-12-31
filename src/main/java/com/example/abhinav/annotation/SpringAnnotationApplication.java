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
	System.out.println(productService); // output : com.example.abhinav.annotation.services.ProductService@4784013e
	}

}
