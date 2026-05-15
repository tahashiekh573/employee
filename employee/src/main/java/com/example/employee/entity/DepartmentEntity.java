package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String deptName;
    private String codeName;
    private double salary;

    public int getId() {
        System.out.println("ID: " + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        System.out.println("Department Name: " + deptName);
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCodeName() {
        System.out.println("Code Name: " + codeName);
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public double getSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}