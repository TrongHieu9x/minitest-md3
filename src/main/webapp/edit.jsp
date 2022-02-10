<%--
  Created by IntelliJ IDEA.
  User: Nguyen Trong Hieu
  Date: 10/02/2022
  Time: 04:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Management</h1>
<h2>
    <a href="home?action=home">List All Student</a>
</h2>
<form action="home?action=editPost" method="post">
    <table>
        <caption>
            <h2>
                Edit Student
            </h2>
        </caption>
            <th> Name:</th>
            <td>
                <input type="text" name="name" size="45"
                       value="<c:out value='${student.name}' />"
                />
            </td>
        </tr>
        <tr>
            <th> Age:</th>
            <td>
                <input type="text" name="age" size="15"
                       value="<c:out value='${student.age}' />"
                />
            </td>
        </tr>
        <tr>
            <th> Address:</th>
            <td>
                <input type="text" name="address" size="45"
                       value="<c:out value='${student.address}' />"
                />
            </td>
        </tr>
        <tr>
            <th>Lop:</th>
            <td>
                <input type="text" name="lop" size="15"
                       value="<c:out value='${student.lop}' />"
                />
            </td>
        </tr>
        <tr>
            <th> avg:</th>
            <td>
                <input type="text" name="avg" size="15"
                       value="<c:out value='${student.avg}' />"
                />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
