package com.curd.repository;

import com.curd.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class CustomerRepoImpl implements CustomerRepository{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findCustomer(String name) {
        return customerRepository.findCustomer(name);
    }
}
