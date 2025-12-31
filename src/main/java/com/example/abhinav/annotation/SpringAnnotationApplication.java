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
	productService.createProduct(); // output : creating product
		// we have not created the object of ProductService using new keyword
		// Spring container is managing the object creation and its lifecycle
		// This is called Inversion of Control (IoC)
		// Spring Framework is based on IoC principle
		// Dependency Injection (DI) is a design pattern to implement IoC
		// In DI, the objects are provided their dependencies at runtime by the container
		// There are three types of DI : Constructor Injection, Setter Injection, Field Injection
		// In this example, we are using Field Injection using @Autowired annotation
		// We can also use @Component annotation to mark a class as a Spring Bean
		// @Service, @Repository, @Controller are specializations of @Component
		// They are used to mark a class as a Service, Repository, Controller respectively

		// we are NOT using dependency injection here.
		// We are manually getting the bean from the container
		// In real world applications, we should use dependency injection

//		What IS being used:
//		Service Locator Pattern - The application is using the container to manually look up and retrieve beans
//		Inversion of Control (IoC) - Yes, Spring is managing the object lifecycle, but that's different from Dependency Injection

	}

}
