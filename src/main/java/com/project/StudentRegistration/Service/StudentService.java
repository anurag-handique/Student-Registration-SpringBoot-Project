package com.project.StudentRegistration.Service;

import com.project.StudentRegistration.Db.StudentRepo;
import com.project.StudentRegistration.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    public void saveUpdate(Student student) {

        repo.save(student);
    }

    public Iterable<Student> listAll() {
        return this.repo.findAll();
    }

    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentById(String studentid) {
        return repo.findById(studentid).get();
    }
}
