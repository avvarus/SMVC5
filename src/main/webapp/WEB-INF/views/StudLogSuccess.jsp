<%--
  Created by IntelliJ IDEA.
  User: Avvarus
  Date: 1/9/18
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Portal App</title>
</head>
<body>

<h3>${msg}</h3>

<h3>User Name :${user.uname}</h3>
<h3>Password :${user.pwd}</h3>
<h3>Cars :${user.skills}</h3>
<%--<h3>Cars :${user.student}</h3>--%>
<h3>
    Student Details

    <table>
        <tr>
            <td>First Name ::</td>
            <td>${user.student.fName}</td>
        </tr>

        <tr>
            <td>Last Name ::</td>
            <td>${user.student.lName}</td>
        </tr>
        <tr>
            <td>Student Age ::</td>
            <td>${user.student.age}</td>
        </tr>
        <tr>
            <td>Student College ::</td>
            <td>${user.student.college}</td>
        </tr>
        <%--<tr>--%>
        <%--<td>Student DOB ::</td>--%>
        <%--<td>${user.student.dob}</td>--%>
        <%--</tr>--%>
    </table>
</h3>
</body>
</html>
