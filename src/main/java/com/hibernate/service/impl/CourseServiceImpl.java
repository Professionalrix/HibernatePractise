package com.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.entities.Course;
import com.hibernate.repository.CourseRepository;
import com.hibernate.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course saveCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseFindById(Long id) {
		
		return courseRepository.getById(id);
	}

	@Override
	public List<Course> getAllCourseById(Iterable<Long> id) {
		
		return courseRepository.findAllById(id);
	}

	
}
