package com.vinesh.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinesh.mongo.model.Student;
import com.vinesh.mongo.model.Student.Gender;
import com.vinesh.mongo.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		return ResponseEntity.ok().body(studentService.addStudent(student));
	}

	@GetMapping
	public ResponseEntity<?> getStudentsByProperties(@RequestParam(required = false) String name,
			@RequestParam(required = false) String email, @RequestParam(required = false) String subjectRef,
			@RequestParam(required = false) String collegeRef, @RequestParam(required = false) Gender gender,
			@RequestParam Integer page) {
		return ResponseEntity.ok()
				.body(studentService.fetchStudentsByProperties(name, email, subjectRef, collegeRef, gender, page));
	}
}
