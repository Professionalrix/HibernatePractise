package com.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.entities.StudentCourseMapping;
import com.hibernate.repository.StudentCourseRepository;
import com.hibernate.services.StudentCourseService;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

	@Autowired
	private StudentCourseRepository stuCourseRepo;
	
	@Override
	public void save(StudentCourseMapping stuCourseMapping) {
		this.stuCourseRepo.save(stuCourseMapping);
		
	}

}
