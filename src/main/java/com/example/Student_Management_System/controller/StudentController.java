package com.example.Student_Management_System.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Student_Management_System.entity.Student;
import com.example.Student_Management_System.service.StudentService;

@Controller
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	@PostMapping("/add-student")
	public String addStudent(Student student)
	{
		studentService.add(student);
		return "index.jsp";
	}
	@GetMapping("/display-student")
	public String display(Model model)
	{
	  List<Student> student	=studentService.findAllStudents();
	  model.addAttribute("display", student);
		return"display.jsp";
	}
	@GetMapping("/delete-student")
	public String delete(@RequestParam("student_id") int studentId)
	{
		studentService.deleteStudent(studentId);
		return "redirect:/display-student";
	}
	@GetMapping("/update-student")
	public String update(@RequestParam("student_id") int studentId,Model model)
	{
	 Student student=studentService.updateStudent(studentId);
	 model.addAttribute("student", student);
		return "update.jsp";
	}
	@PostMapping("/update")
	public String updateAll(@ModelAttribute Student student)
	{
		studentService.updateById(student);
		return"redirect:/display-student";
	}
	

}
