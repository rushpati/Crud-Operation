package com.curd.repository;

import com.curd.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerRepoImpl extends CustomerRepository {

  /*//  @Autowired
  //  CustomerRepository customerRepository = null;
    
  // default List<Customer> findCustomer(String name) {
        return customerRepository.findCustomer(name);
    }*/
}
