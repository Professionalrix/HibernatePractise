package com.hibernate.services;

import java.util.List;

import com.hibernate.entities.Course;

public interface CourseService {
	
	Course saveCourse(Course course);
	
	List<Course> getAllCourses();
	
	Course getCourseFindById(Long id);
	
	List<Course> getAllCourseById(Iterable<Long> id);
	

}
