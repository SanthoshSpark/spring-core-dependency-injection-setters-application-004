package com.spring.core.demo;

//Movie.java
public class Movie {
	 private String title;
	 private Actor actor;
	
	 // Setter for Actor dependency (DI)
	 public void setActor(Actor actor) {
	     this.actor = actor;
	 }
	
	 public void setTitle(String title) {
	     this.title = title;
	 }
	
	 @Override
	 public String toString() {
	     String out = "Title: " + title;
	     out = out + "\nLead Actor: " + actor.getName();
	     
	     return out;
	 }
}
