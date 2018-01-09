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
        <h3>
            <ul>
                <li>UserName <input type="text" name="uname"></li>
                <li>Password <input type="password" name="pwd"></li>
                <input type="submit" name="submit">
            </ul>

        </h3>
    </form>
</div>
</body>
</html>
