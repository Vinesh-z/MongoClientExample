package com.vinesh.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.vinesh.mongo.model.Student;
import com.vinesh.mongo.model.Student.Gender;
import com.vinesh.mongo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> fetchStudentsByProperties(String name, String email, String subjectRef, String collegeRef,
			Gender gender, Integer page) {
		return studentRepository.findStudentsByProperties(name, email, subjectRef, collegeRef, gender,
				PageRequest.of(page, 15));
	}
}
