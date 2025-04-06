<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product_Categories</title>
</head>
<body>
	
	<center>
	<h3>Category Registration Form</h3>
	<form action="req1" method="post">
	<table>
	<tr>
	<td align="right">ID:</td>
	<td><input type="text" name="id" value="0"></td>
	</tr>
		<tr>
	<td align="right">Name:</td>
	<td><input type="text" name="name"></td>
	</tr>
	<tr>
	<td colspan="2" align ="center">
	<input type="submit" name="b1" value="Add">
	<input type="submit" name="b1" value="Delete">
	<input type="submit" name="b1" value="Display">
	</td>
	</tr>
	</table>
	</form>
	<h2>List Of Categories</h2>
		<table border="5">
			<th>ID</th>
			<th>Name</th>
			<c:forEach var="c" items="${Categories}">
			<tr>
			<td>${c.id }</td>
			<td>${c.name }</td>
			</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>