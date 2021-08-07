package com.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.entities.Course;
import com.hibernate.entities.Student;
import com.hibernate.repository.StudentRepository;
import com.hibernate.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

		@Autowired
		private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
			
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
			return studentRepository.findAll();
		
	}

	@Override
	public Student getFindByID(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> getAllStudentById(Long id) {
		System.out.println("student repository is working");
		Optional<Student> list = studentRepository.findById(id);
		System.out.println(list);	
		
		
		
		return null;
	}

	@Override
	public List<Student> getAllStudentByCourse(Course course) {
	
		return null;
	}

	@Override
	public Student getFindByIdByHQL(Long id) {
			
		return studentRepository.getStudentbyIdByHQL(id); 
	}

	@Override
	public List<Student> getAllStudentByHql() {
		
		return studentRepository.getAllStudentByHQL();
	}

	@Override
	public List<Student> getStudentByCourse(Long id) {
		
//		return studentRepository.getCustomStudentByCourse(id);
		return null;
	}


	

}
