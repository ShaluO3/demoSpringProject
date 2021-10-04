package com.example.course.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	
	@GetMapping(value = "/courses/{id}")
	public Course getCourse(@PathVariable String id) 
	{
	   return cs.getCourse(id);
    }
	
	
	
	@RequestMapping( method = RequestMethod.POST ,value = "/courses")
	public void addCourse(@RequestBody Course course) 
	{
	      cs.addCourse(course);
    }
	
	
	@RequestMapping( method = RequestMethod.PUT ,value = "/courses/{id}")
	public void updateCourse(@RequestBody Course course , @PathVariable String id) 
	{
	      cs.updateCourse(course , id);
    }
	
	
	@RequestMapping( method = RequestMethod.DELETE ,value = "/courses/{id}")
	public void deleteCourse(@PathVariable String id) 
	{
	    cs.deleteCourse(id);
    }
	
	
	
	
}
