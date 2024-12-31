package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.annotation.processing.Generated;

@Entity
@Table (name="employeeinfo")
public class Employee {
    @Id
    @GeneratedValue(Strategy=GenerationType.AUTO,generator="empid_generator")
    @SequenceGenerator(name="empid_generator",initialValue=1,allocationSize=1)
    private int empId;
    @Column (name="emp_name")
    private String empName;
    private int empSalary;
    public int getEmpId(){
        return empId();
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}

