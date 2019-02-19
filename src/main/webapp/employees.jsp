<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>Employees</title>
</head>
<jsp:include page="header.jsp"/>

<body>
<h1>Employees page!</h1>

<%--<span><c:out value="${employeeService.getAll()}"/></span>--%>

<%--<span><c:out value="${employeeService.findById(1).getName()}"/></span>--%>
<c:forEach items="${employeeService.getAll()}" var="employee">
    <span><c:out value="${employee.getId()}"/></span>
    <span><c:out value="${employee.getName()}"/></span>
    <span><c:out value="${employee.getHire_date()}"/></span>
    <span><c:out value="${employee.getDepartment()}"/></span>
    <span><c:out value="${employee.getManager()}"/></span>
</c:forEach>
<%--<c:forEach items="${userService.findById(1)}" var="user">--%>
    <%--<span><c:out value="${employee.getUsername()}"/></span>--%>
<%--</c:forEach>--%>


</html>
