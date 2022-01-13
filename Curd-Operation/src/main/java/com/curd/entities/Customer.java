package com.curd.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;

//@Entity
//@Table(name = "CUSTOMER")

@Component
public class Customer {

  //  @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String name;
    private  String Last_name;

    public Customer(int id, String name, String last_name) {
        this.id = id;
        this.name = name;
        Last_name = last_name;
    }

    public Customer() {
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return Last_name
     */
    public String getLast_name() {
        return this.Last_name;
    }

    /**
     * set field
     *
     * @param Last_name
     */
    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }
}
