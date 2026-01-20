package com.example.backend_crudapp.service;

import com.example.backend_crudapp.model.Student;
import com.example.backend_crudapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Optional<Student> getStudentById(Long id){
        return repo.findById(id);
    }

    public Student postStudent(Student student){
        return repo.save(student);
    }

    public void deleteStudentById(Long id){
        repo.deleteById(id);
    }

    public Student putStudent(Long id,Student student){
        Optional<Student> optionalStudent = repo.findById(id);
        if(optionalStudent.isPresent()){
            Student st = optionalStudent.get();
            st.setStudentName(student.getStudentName());
            st.setStudentEmail(student.getStudentEmail());
            st.setStudentYear(student.getStudentYear());
            st.setStudentDept(student.getStudentDept());
            return repo.save(st);
        }else{
            throw new RuntimeException("Student Not Found with Id : "+id);
        }
    }
}
