package com.oocl.springbootemployee.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Employee> employees;

    public Company() {
    }

    public Company(int id, String name, String address, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
