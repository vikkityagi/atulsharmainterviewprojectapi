package com.example.demoProj.resources;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class EmpResources {

    @JsonProperty("id")
    private int id;

    @JsonProperty("empName")
    private String empName;

    @JsonProperty("designation")
    private int designation;

    @JsonProperty("dob")
    private LocalDate dob;

    @JsonProperty("salary")
    private double salary;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email cannot be empty")
    @JsonProperty("email")
    private String email;
}
