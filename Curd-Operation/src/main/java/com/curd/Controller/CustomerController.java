package com.curd.Controller;

import com.curd.repository.CustomerRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/custo")
public class CustomerController {

 //   @Autowired(required = true)
 //   CustomerRepoImpl customerRepo;

    @GetMapping(value ="get/customer/{id}")
    public void findCuster(@PathVariable("id") String name){
        System.out.println("name coming from user " +  name);


     //   List names = customerRepo.findCustomer(name);
       // names.stream().forEach(s-> System.out.println(s));

    }
}
