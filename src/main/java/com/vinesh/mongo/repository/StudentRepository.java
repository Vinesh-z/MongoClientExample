package com.vinesh.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vinesh.mongo.customrepo.StudentCustomRepository;
import com.vinesh.mongo.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>, StudentCustomRepository {

}
