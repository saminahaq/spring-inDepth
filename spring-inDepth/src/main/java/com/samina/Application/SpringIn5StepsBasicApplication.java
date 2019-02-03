package com.samina.Application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.samina.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.samina.basic")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			System.out.println("binarySearch");
			BinarySearchImpl binarySearch = 
					applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 = 
					applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);
		}
	}
}
