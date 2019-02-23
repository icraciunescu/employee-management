<!DOCTYPE html>
<html>

<head>
    <title>Add Employee</title>

    <link type="text/css" rel="stylesheet" href="css/style.css">
    <link type="text/css" rel="stylesheet" href="css/add-employee-style.css">
</head>


<body>
<div id="wrapper">
    <div id="header">
        <h2>Employee Management</h2>
    </div>
    <div id="container"></div>
        <h3>Add Employee</h3>
        <form action="/AddEmployee" method="post">
            <input type="text" placeholder="Name" required="required" name="name"/>
            <input type="text" placeholder="Hire-Date" required="required" name="hire-date"/>
            <input type="text" placeholder="Department" required="required" name="department"/>
            <input type="text" placeholder="Manager" required="required" name="manager"/>
            <button type="submit" class="btn btn-primary btn-block btn-large">Add</button>
        </form>
        <div style="clear: both;"></div>
        <p>
            <a href="employees.jsp">Back to List</a>
        </p>

</div>

</body>
</html>