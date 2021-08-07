package com.hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hibernate.entities.Course;
import com.hibernate.services.CourseService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public String viewallcourse(Model model) {
		
	List<Course> courseList=courseService.getAllCourses();
		model.addAttribute("courseList", courseList);
		return "courses";
	}
	
	@GetMapping("/course/new")
	public String addCourses(@ModelAttribute("course") Course course) {
		
		
		return "add_Courses";
	}
	@PostMapping("/course/new")
	public String addCourses1(@ModelAttribute("course") Course course) {
		
		 courseService.saveCourse(course);
		return "redirect:/courses";
	}
	

}
