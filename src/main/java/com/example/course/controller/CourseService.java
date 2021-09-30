package com.example.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	  private List<Course> courses = Arrays.asList(
			   new Course("1" , "java" ,"This is java course"),
			   new Course("2" , "javaScript" ,"This is javaScript course"),
			   new Course("3" , "Android" ,"This is android course")
			   ); 
	  
	  public List<Course> getAllCourses(){
		  return courses;
	  }
	
}
