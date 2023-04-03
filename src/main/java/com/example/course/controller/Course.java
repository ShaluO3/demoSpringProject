package com.example.course.controller;

public class Course 
{

	private String id ;
	private String name ;
	private String desc ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String courseName;
	public int subject_id;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public Course() {
		super();
	}
	
	public Course(String id, String name, String desc,String courseName,int subject_id ) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.courseName=courseName;
		this.subject_id=subject_id;
	}
	
	

}
