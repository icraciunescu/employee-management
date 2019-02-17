package com.sda.dao;

import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao extends GenericDao<Employee> {

    public List getAllEmployees() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> employees = session.createQuery("FROM Employee").list();
        transaction.commit();
        session.close();

        return employees;
    }
}
