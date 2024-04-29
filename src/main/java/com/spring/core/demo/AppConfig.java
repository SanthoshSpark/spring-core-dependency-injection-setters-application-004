package com.spring.core.demo;

//AppConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	 @Bean
	 public Actor actor() {
	     Actor actor = new Actor();
	     actor.setName("Tom Hanks");
	     return actor;
	 }
	
	 @Bean
	 public Movie movie() {
	     Movie movie = new Movie();
	     movie.setTitle("Forrest Gump"); // Set the title
	     movie.setActor(actor());
	     return movie;
	 }
}
