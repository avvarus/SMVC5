<%--
  Created by IntelliJ IDEA.
  User: Avvarus
  Date: 1/9/18
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>

<div style="margin: 20px">
    <form method="post" action="/SMVC5/submitStud">

        <h1>Login in email acct</h1>
        <table>
            <tr>
                <td>UserName :: <input type="text" name="uname"></td>
            </tr>
            <tr>
                <td>Password :: <input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td>Cars &nbsp;<select name="skills" multiple>--Select--
                    <option value="volvo">Volvo</option>
                    <option value="saab">Saab</option>
                    <option value="mercedes">Mercedes</option>
                    <option value="audi">Audi</option>
                </select></td>
            </tr>
            <tr>
                <td>
                    <li>First Name <input type="text" name="student.fName"></li>
                    <li> Last Name <input type="text" name="student.lName"></li>
                    <li>Age Name <input type="text" name="student.age"></li>
                    <%--<li>Date Of Birth <input type="date" name="student.dob"></li>--%>
                    <li>College <input type="text" name="student.college"></li>
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="submit"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
