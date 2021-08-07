package com.hibernate.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hibernate.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
//	@Transactional
//	@Modifying
//    @Query("SELECT e FROM Employee  e LEFT JOIN Course c ON e.id=c.id WHERE c.id =:id")
//	List<Student> getStudent(Long id);
//	
	@Query("FROM Student WHERE id =:id")
	Student getStudentbyIdByHQL(Long id);
	
	@Query("SELECT s from Student s")
	List<Student> getAllStudentByHQL();
	
//	@Query("SELECT s FROM Student s WHERE  s.course.id=:id")
//	List<Student> getCustomStudentByCourse(Long id);
	
	
}
