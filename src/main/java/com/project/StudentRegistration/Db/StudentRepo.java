package com.project.StudentRegistration.Db;

import com.project.StudentRegistration.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {
}
