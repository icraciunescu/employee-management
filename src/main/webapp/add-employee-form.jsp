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
        <form action="employees.jsp" method="GET">
            <input type="hidden" name="command" value="ADD"/>
            <table>
                <tbody>
                <tr>
                    <td><label>Name:</label></td>
                    <td><input type="text" name="name"></td>
                    <td><label>Hire date:</label></td>
                    <td><input type="text" name="Hire Date"></td>
                    <td><label>Department:</label></td>
                    <td><input type="text" name="Department"></td>
                    <td><label>Manager:</label></td>
                    <td><input type="text" name="Manager"></td>
                    <td><label></label></td>
                    <td><input type="submit" value="Save"></td>
                </tr>
                </tbody>
            </table>

        </form>
        <div style="clear: both;"></div>
        <p>
            <a href="employees.jsp">Back to List</a>
        </p>

</div>

</body>
</html>