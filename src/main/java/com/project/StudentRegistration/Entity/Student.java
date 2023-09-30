package com.project.StudentRegistration.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@Document(collection = "student")
public class Student {
    @Id
    private String _id;
    private  String studentName;
    private String phoneNumber;

    private String studentAddress;

    public Student(String _id, String studentName, String phoneNumber, String studentAddress) {
        this._id = _id;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.studentAddress = studentAddress;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
