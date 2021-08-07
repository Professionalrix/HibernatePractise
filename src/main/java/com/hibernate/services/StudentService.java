package com.hibernate.services;

import java.util.List;

import com.hibernate.entities.Course;
import com.hibernate.entities.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getFindByID(Long id);
	
	void deleteStudentById(Long id);
	
	List<Student> getAllStudentById(Long id);

	List<Student> getAllStudentByCourse(Course course);
	
	//Hql Queries
	Student getFindByIdByHQL(Long id);
	
	List<Student> getAllStudentByHql();
	
	List<Student> getStudentByCourse(Long id);
	
	

}
