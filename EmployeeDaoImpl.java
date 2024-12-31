package com.spring;

import com.hibernate.Employee;
import java.util.List;

import org.springframework.orm.hibernate.HibernateTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }
    public void saveEmployee(int empId, int empSalary){
        SessionFactory sf = hibernateTemplate.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(emp);
        tx.commit();
        s.close();

    }
    public void updateEmployee(int empId){
        Employee emp = hibernateTemplate.get(Employee.class,empId);
        emp.setEmpSalary(empSalary);
        hibernateTemplate.update(emp);
    }
    public void deleteEmployee(int empId, int empSalary){
        Employee emp = hibernateTemplate.get(Employee.class,empId);
        hibernateTemplate.delete(emp);
    }
    public List<Employee> listEmployee(){
        return null;
    }
}
