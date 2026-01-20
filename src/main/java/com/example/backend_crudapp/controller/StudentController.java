package com.example.backend_crudapp.controller;

import com.example.backend_crudapp.model.Student;
import com.example.backend_crudapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList = service.getAllStudents();
        if(studentList.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(studentList);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable Long studentId){
        Optional<Student> st = service.getStudentById(studentId);
        if(st.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(st);
    }

    @PostMapping("")
    public ResponseEntity<Student> postStudent(@RequestBody Student student){
        Student st = service.postStudent(student);
        if(st!=null){
            return ResponseEntity.status(201).body(student);
        }
        return ResponseEntity.status(500).build();
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long studentId){
        service.deleteStudentById(studentId);
        return ResponseEntity.status(200).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> putStudent(@PathVariable Long id, @RequestBody Student student){
        Student updatedStudent = service.putStudent(id, student);
        return ResponseEntity.status(200).body(updatedStudent);
    }
}
