package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;
import com.sda.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/AddEmployee")
public class AddEmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Employee employee = new Employee();
        employee.setName(request.getParameter("name"));
        //employee.setDepartment(request.getParameter("department"));
        employee.setHire_date(request.getParameter("hire-date"));
        employee.setManager(request.getParameter("manager"));
        employeeService.createEmployee(employee);
        response.sendRedirect("employees.jsp");
    }
}
