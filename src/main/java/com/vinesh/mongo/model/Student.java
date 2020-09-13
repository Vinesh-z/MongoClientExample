package com.vinesh.mongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student {
	@Id
	private String id;
	private String name;
	private String email;
	private List<String> subjectRefs;
	private String collegeRef;
	private Gender gender;
	
	public enum Gender {
		MALE, FEMALE, OTHER
	}
}
