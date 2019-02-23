package com.sda.servlet;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/employees")
public class Employees extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        Employee employee = employeeService.findById(1L);
        response.getWriter().println("Hello World!");
    }

    /**
     * Delete an employee
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long employeeId = Long.valueOf(req.getParameter("id"));
        Employee employee = employeeService.findById(employeeId);
        employeeService.deleteEmployee(employee);
        resp.sendRedirect("employees.jsp");
    }
}
