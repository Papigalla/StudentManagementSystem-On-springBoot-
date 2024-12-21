package com.example.Student_Management_System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student_Management_System.entity.Student;
import com.example.Student_Management_System.repository.StudentRepository;
@Service
public class StudentService {
	private final StudentRepository studentRepository;
	

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public void add(Student student) {
		studentRepository.save(student);
		
		
	}


	public List<Student> findAllStudents() {
		return studentRepository.findAll();
		
	}


	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
		
	}


	public Student updateStudent(int studentId) {
		return studentRepository.findById(studentId).orElseThrow();
	}


	public void updateById(Student student) {
		studentRepository.save(student);
		
	}

}
