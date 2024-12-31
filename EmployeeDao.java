package com.spring;

public class EmployeeDao {
    public void saveEmployee(Employee emp);
    public void updateEmployee(int empId,int empSalary);
    public void deleteEmployee(int empId);
    public List<Employee> listEmployee();
}
