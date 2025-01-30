package com.example.demoProj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoProj.entity.Designation;

public interface DesignationRepo extends JpaRepository<Designation,Integer> {
    
}
