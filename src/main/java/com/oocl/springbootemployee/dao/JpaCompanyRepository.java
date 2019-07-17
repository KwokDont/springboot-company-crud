package com.oocl.springbootemployee.dao;


import com.oocl.springbootemployee.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCompanyRepository extends JpaRepository<Company,Integer> {
}
