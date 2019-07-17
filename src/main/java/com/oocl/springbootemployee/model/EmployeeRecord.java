package com.oocl.springbootemployee.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_record")
public class EmployeeRecord {

    @Id
    @GeneratedValue
    private int id;
    private String detail;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
