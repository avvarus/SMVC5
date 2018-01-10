<%--
  Created by IntelliJ IDEA.
  User: Avvarus
  Date: 1/9/18
  Time: 1:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<title>Title</title>--%>
</head>
<body>

<h1> Student Registration Portal </h1>
<%--<h2>${msg}</h2>--%>

<div style="margin: 20px">

    <form action="/SMVC5/submitPage" method="post">
        <ol>
            <li>First Name <input type="text" name="fName"></li>
            <li> Middle Name <input type="text" name="lName"></li>
            <li>Age Name <input type="text" name="age"></li>
            <li>Date Of Birth <input type="date" name="dob"></li>
            <li>College <input type="text" name="college"></li>

            <p><input type="submit" name="submit"></p>
        </ol>
    </form>

</div>


</body>
</html>
