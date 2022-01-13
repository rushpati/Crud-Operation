package com.curd.repository;

import com.curd.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {


    @Query(value = "SELECT * FROM CUSTOMER WHERE NAME=?1", nativeQuery = true)
    List<Customer> findCustomer(String name);

}
