package com.example.demoProj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProj.entity.Designation;
import com.example.demoProj.entity.EmpEntity;
import com.example.demoProj.repo.DesignationRepo;
import com.example.demoProj.repo.EmpRepo;
import com.example.demoProj.resources.EmpResources;

@RestController
@CrossOrigin
public class EmpController {

    @Autowired
    private DesignationRepo designationRepo;

    @Autowired
    private EmpRepo empRepo;
    
    @PostMapping("/save_emp")
    public EmpEntity post(@RequestBody EmpResources empResources){
        EmpEntity empEntity = new EmpEntity();

        Designation designation = this.designationRepo.findById(empResources.getDesignation()).get();
        empEntity.setDesignation(designation.getName());
        empEntity.setEmpName(empResources.getEmpName());
        empEntity.setSalary(empResources.getSalary());
        empEntity.setDob(empResources.getDob());

        return this.empRepo.save(empEntity);

    }
    
}
