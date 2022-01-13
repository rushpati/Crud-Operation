package com.curd.repository;

import com.curd.Controller.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import sun.reflect.generics.scope.Scope;

@Service
public class StudentOperations  {

    @Autowired
    private StudentRepository studentRepository;

    public  void saveStudent(Student student){
        studentRepository.save(student);
    }
}
