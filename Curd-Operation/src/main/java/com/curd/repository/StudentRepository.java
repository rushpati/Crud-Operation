package com.curd.repository;

import com.curd.Controller.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

            @Query(value = "SELECT * FROM STUDENT WHERE LNAME=?1 and Fname=?2", nativeQuery = true)
            List findStudenByLastName(String Lname, String Fname);


}
