package com.sda.service;

import com.sda.dao.EmployeeDao;
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

    //todo
    public boolean wantDeleted() {
        return true;
    }


}
