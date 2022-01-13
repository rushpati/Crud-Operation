package com.curd.Controller;

import com.curd.repository.StudentOperations;
import com.curd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;
@RestController
public class FrontController {

    @Autowired
    StudentOperations  studentOperations;



    @Autowired
    private  StudentRepository studentRepository;


    @Value("${config.name}")
    private  String name ;


    @GetMapping("/find/{lname}/{fname}")
    public List<Student> findbyLname(@PathVariable("lname") String lname,@PathVariable("fname") String fname){
        System.out.println("lName "+ lname + "fname"+ fname);
         List l1 = studentRepository.findStudenByLastName(lname,fname);


          l1.stream().forEach(l -> System.out.println(l.toString()));
        return l1; //l1;
    }

    @GetMapping("/h")
    public String Test(){

            return  "successfylly...accessed " + name;
    }
    @PostMapping("/save/user/")
    public ResponseEntity<?> saveUser(@RequestBody Student student) {
            studentRepository.save(student);

        System.out.println("Student infor = " + student.toString());
        return  new ResponseEntity(HttpStatus.OK);
    }

}