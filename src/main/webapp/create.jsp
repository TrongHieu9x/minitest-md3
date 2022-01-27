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
<h1>Create new product</h1>
<form action="/products?param=createPost" method="post">
    <label>ID:
        <input type="text" name="id">
    </label><br>
    <label>Name:
        <input type="text" name="name">
    </label><br>
    <label>Price:
        <input type="text" name="price">
    </label><br>
    <label>Quantity:
        <input type="text" name="quantity">
    </label><br>
    <label>Mota:
        <input type="text" name="mota">
    </label><br>
    <button type="submit">Create</button>
</form>
</body>
</html>
