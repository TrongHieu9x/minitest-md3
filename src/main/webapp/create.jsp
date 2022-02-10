<%--
  Created by IntelliJ IDEA.
  User: Nguyen Trong Hieu
  Date: 10/02/2022
  Time: 03:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student</h1>
<h2>
    <a href="home?action=home">List All Student</a>
</h2>
<div>
    <form action="home?action=createPost" method="post">
        <table>
            <caption>
                <h2>Add New Student</h2>
            </caption>
            <tr>
                <th>Name:</th>
                <th>Age:</th>
                <th>Address:</th>
                <th>Lop:</th>
                <th>Avg:</th>
                <td colspan="2">
            </tr>
            <tr>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
                <td>
                    <input type="text" name="age" id="age" size="15"/>
                </td>
                <td>
                <input type="text" name="address" id="address" size="55"/>
                </td>
                <td>
                    <input type="text" name="lop" id="lop" size="25"/>
                </td>
                <td>
                    <input type="text" name="avg" id="avg" size="15"/>
                </td>
                <td>
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
