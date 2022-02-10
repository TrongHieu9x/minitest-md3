<%--
  Created by IntelliJ IDEA.
  User: Nguyen Trong Hieu
  Date: 27/01/2022
  Time: 01:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All Products</h1>
<button><a href="/products?param=createGet">Create new product</a></button>
<button><a href="/products?param=sort">Sắp xếp</a></button>
<table>
    <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td>lop</td>
        <td>avg</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${student}" var="student">
        <tr>
            <td>${student.getName()}</td>
            <td>${student.getAge()}</td>
            <td>${student.getAddress()}</td>
            <td>${student.getLop()}</td>
            <td>${student.getAvg()}</td>
            <td>
                <button><a href="">Edit</a></button>
            </td>
            <td>
                <button><a href="">Delete</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
