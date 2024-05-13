package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(ShopApplication.class, args);
		List<Object> beans = Collections.singletonList(Arrays.stream(run.getBeanDefinitionNames()).toList());
		beans.forEach(System.out::println);
	}

}
