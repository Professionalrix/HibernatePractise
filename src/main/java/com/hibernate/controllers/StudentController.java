package com.hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hibernate.entities.Course;
import com.hibernate.entities.Student;
import com.hibernate.entities.StudentCourseMapping;
import com.hibernate.repository.StudentRepository;
import com.hibernate.services.CourseService;
import com.hibernate.services.StudentCourseService;
import com.hibernate.services.StudentService;

@Controller
public class StudentController {
		
		@Autowired
		private StudentService studentService;
		
		@Autowired
		private CourseService courseService;
		
		@Autowired
		private StudentCourseService stuCourseService;
		
		@GetMapping("/manytomany")
		public String manytomany(Model model) {
				
					List<Student> studentList= studentService.getAllStudents();
					List<Course> courseList = courseService.getAllCourses();
					model.addAttribute("studentList", studentList);
					model.addAttribute("courseList", courseList);
				
			
			
			
			return"manytomany";
		}
		
		@PostMapping("/manytomany")
		public String manytomanyperform() {
			
			
			
			return "redirect:/manytomany";
		}
		
		
		
		
		@GetMapping("/home")
		public String homePage(Model model) {
				List<Student> studentList	=studentService.getAllStudents();
					model.addAttribute("studentList", studentList);
			List<Course> courseList =courseService.getAllCourses();
					model.addAttribute("courseList", courseList);
			
			return "home";
		}
		
		@PostMapping("/alldetails")
		public String saveAllDetails(@RequestParam("studentId")Long studentId,@RequestParam("courseId")Long courseId) {
			
			StudentCourseMapping stuCourseMapping = new StudentCourseMapping();
			stuCourseMapping.setStudentId(studentId);
			stuCourseMapping.setCourseId(courseId);
			
			this.stuCourseService.save(stuCourseMapping);
		
			//student.setCourse(courseService.getAllCourseById(courseList));
			System.out.println("successfully done...");
			System.out.println(courseId);
		  	
			return "redirect:/home";
		}
		
		
	

		@GetMapping("/index")
		public String indexPage() {
			
			return "index";
		}
		
		@PostMapping("/new")
		public String saveStudent(@ModelAttribute("student") Student student) {
				
			studentService.saveStudent(student);
			System.out.println("add successfully");
			
			return "redirect:/index";
		}
		
		
		@GetMapping("/students")
		public String viewStudent(Model model) {
			List<Student> studentList1 =studentService.getAllStudents();

				model.addAttribute("studentList", studentList1);
			
			
			return "students";
			
		}
		
		@GetMapping("/student/new/{id}")
		public String updateStudentFindById(@PathVariable Long id)
		{
//			System.out.println(id);
//			Student student=new Student();
//			Course course=new Course();
//			student.setCourse(course);
			return "redirect:/students";
		}
		
		
		@GetMapping("/student/delete/{id}")
		public String deleteStudentFindById(@PathVariable Long id)
		{
			System.out.println(id);
			
			studentService.deleteStudentById(id);
			return "redirect:/students";
		}
		
}
