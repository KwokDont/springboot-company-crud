package com.oocl.springbootemployee.controller;

import com.oocl.springbootemployee.dao.JpaCompanyRepository;
import com.oocl.springbootemployee.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class JpaCompanyContoller {

    @Autowired
    private JpaCompanyRepository companyRepository;

    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company){
        return companyRepository.save(company);
    }

    @GetMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    @DeleteMapping("/companies/{companyId}")
    public void deleteCompany(@PathVariable int companyId){ companyRepository.deleteById(companyId); }

    @PutMapping("/companies")
    public void updateCompany(@RequestBody Company company){ companyRepository.save(company); }
}
