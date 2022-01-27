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
<br>
<br>
<form action="/products?param=search" method="post">
    <label><input type="text" name="search-name"></label>
    <button type="submit">Search</button>
</form>

<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Quantity</td>
        <td>Mota</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getQuantity()}</td>
            <td>${product.getMota()}</td>
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
