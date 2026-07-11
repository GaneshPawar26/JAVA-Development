package com.ganesh.demoSpringBootApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootAppApplication {

	public static void main(String[] args) {

// doing revision
		ApplicationContext context=SpringApplication.run(DemoSpringBootAppApplication.class, args);

		Dev d1=context.getBean(Dev.class);
		d1.build();
	}

}
