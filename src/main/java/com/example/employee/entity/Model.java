package com.example.employee.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name ="employee")
public class Model {
@Id
    public int empid ;
    public String empname;
    public int age;
    public String mobile;


}
