package com.sample.pilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PilotApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(PilotApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
		System.out.println(result);
	}

}
