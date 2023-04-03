package com.example.course.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	  private List<Course> courses = new ArrayList<>( Arrays.asList(
			   new Course("1" , "java" ,"This is java course","java",1),
			   new Course("2" , "javaScript" ,"This is javaScript course","python",2),
			   new Course("3" , "Android" ,"This is android course","mysql",3)
			   )); 
	  
	  public List<Course> getAllCourses(){
		  return courses;
	  }
	  
	  public Course getCourse(String id) {
		  
			 for(int i=0; i<courses.size();i++) {
				 Course obj = courses.get(i);
				 
				 if(obj.getId().equals(id)) return obj;
			 }
			 return null;
	  }

	public void addCourse(Course course) {
		courses.add(course);
	}

	
	public void updateCourse(Course course, String id) {
		
		 for(int i=0; i<courses.size();i++) {
			 Course obj = courses.get(i);
			 
			 if(obj.getId().equals(id)) {
				 courses.set(i, course);
				 return ;
			 }
		 }
		
	}

	public void deleteCourse(String id) {
		
		for(int i=0; i<courses.size();i++) {
			 Course obj = courses.get(i);
			 
			 if(obj.getId().equals(id)) courses.remove(i);
		 }
	}
	
}
