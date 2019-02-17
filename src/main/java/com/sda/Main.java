package com.sda;

import com.sda.service.EmployeeService;

public class Main {

    public static void main(String[] args) {
//        User user = new User("admin", "admin");
//        UserDao userDao = new UserDao();
//        userDao.createEntity(user);
//        Employee employee = new Employee();
//        employee.setName("Cosmin A");
//          EmployeeDao employeeDao = new EmployeeDao();
////          Employee employee = employeeDao.getEntityById(Employee.class, 1L);
//
//        System.out.println(employee.getName());
//        employeeDao.createEntity(employee);

//        System.out.println(employeeDao1.getAllEmployees());

//        EmployeeDao employeeDao = new EmployeeDao();
//        List <Employee> employees = employeeDao.getAllEmployees();
//        System.out.println(employees);

        EmployeeService employeeService = new EmployeeService();
        System.out.println(employeeService.getAll());

    }
}
