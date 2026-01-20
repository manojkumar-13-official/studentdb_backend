package com.example.backend_crudapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String studentName;
    private String studentEmail;
    private String studentYear;
    private String studentDept;

    public Student(String studentDept, String studentEmail, long studentId, String studentName, String studentYear) {
        this.studentDept = studentDept;
        this.studentEmail = studentEmail;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentYear = studentYear;
    }

    public Student() {
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }
}
