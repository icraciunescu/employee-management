package com.sda.servlet;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;
import com.sda.service.DepartmentService;
import com.sda.service.DepartmentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/department")
public class Departments extends HttpServlet {

    private DepartmentService departmentService = new DepartmentService();

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
//        Departments department = DepartmentService.findById(1L);
        response.getWriter().println("Hello World!");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long departmentId = Long.valueOf(req.getParameter("id"));
//        Departments department =departmentService.findById(departmentId);
//        employeeService.deleteEmployee(employee);
        resp.sendRedirect("department.jsp");
    }
}
