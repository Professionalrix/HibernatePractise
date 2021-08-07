package com.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
