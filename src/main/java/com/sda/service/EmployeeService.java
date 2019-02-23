package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.dao.GenericDao;
import com.sda.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id){
        return employeeDao.getEntityById(Employee.class, id);
    }

    public List<Employee> getAll() {
        return employeeDao.getAllEmployees();
    }

    public void createEmployee(Employee employee){
        employee.setWant_deleted("isNotDeleted");
        GenericDao genericDao = new GenericDao();
        genericDao.createEntity(employee);



    }

    //todo
    public boolean wantDeleted() {
        return true;
    }


}
