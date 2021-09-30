package com.example.course.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 
{
	@Autowired
	private CourseService cs ;
	
	
	@GetMapping(value = "/courses")
	public List<Course> getResponse() 
	{
	   return cs.getAllCourses();
   }
}
