package com.spring.core.demo;

//MainApp.java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	 public static void main(String[] args) {
	     try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
	         // Retrieve the Movie bean from the context
	         Movie movie = context.getBean(Movie.class);
	
	         // Use the Movie object
	         System.out.println(movie);
	     }
	 }
}
