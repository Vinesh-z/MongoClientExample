package com.vinesh.mongo.customrepo;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.vinesh.mongo.model.Student;
import com.vinesh.mongo.model.Student.Gender;

public interface StudentCustomRepository {
	public List<Student> findStudentsByProperties(String name, String email, String subjectRef, String collegeRef, Gender gender, Pageable page);
}
