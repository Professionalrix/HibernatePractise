package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entities.StudentCourseMapping;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourseMapping, Long>{
	

}
