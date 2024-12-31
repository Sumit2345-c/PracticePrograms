package com.hibernate;

import javax.transaction.TransactionRequiredException;

import org.hibernate.Session;

import com.hibernate.HibernateUtil;

public class EmployeeTest {
   public static void main(String[] args) {
       
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
    Employee emp = new Employee();
    emp.setEmpId(111);
    emp.setEmpName("Raj");
    emp.setEmpSalary(8000);
    s.persist(emp);
    tx.commit();
    s.close();
   }
}
