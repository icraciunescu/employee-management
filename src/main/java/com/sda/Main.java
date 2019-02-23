package com.sda;

import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;

public class Main {

    public static void main(String[] args) {
        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);

        Department department= new Department();
        department.getEmployees();

        Employee employee= new Employee();

        employee.setName("Cosmin A");

        EmployeeDao employeeDao = new EmployeeDao();
         employeeDao.createEntity(employee);



    }
}
