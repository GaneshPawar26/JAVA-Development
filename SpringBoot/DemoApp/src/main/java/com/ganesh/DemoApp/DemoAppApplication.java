package com.ganesh.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

	ApplicationContext context= SpringApplication.run(DemoAppApplication.class, args);

		Hello h1=context.getBean(Hello.class);
		String s=h1.greet();
		System.out.println(s);
	}

}
