package com.vyku.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String empName;
    private String empAddress;
    private Double sal;
    

}
