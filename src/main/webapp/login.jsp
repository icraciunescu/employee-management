<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<div style="color:blue">
    <h3>
    <div class="login">
        <h1>Login</h1>
        <form action="login" method="post">
            <input type="text" placeholder="Username" required="required" name="un"/>
            <input type="password" placeholder="Password" required="required" name="pw" />
            <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
        </form>
    </div>
    </h3>
</div>
</body>
</html>