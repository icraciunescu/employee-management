<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2/25/2019
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Departments</title>
</head>
<jsp:include page="department"/>
<body>

</body>
</html>
