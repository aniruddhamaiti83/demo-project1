package com.nt.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.rest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<Course>();
		list.add(new Course(145,"ani","desi"));
		list.add(new Course(146,"Bni","Tesi"));
	}
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	
}
