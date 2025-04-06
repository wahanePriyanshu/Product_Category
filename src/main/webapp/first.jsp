<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>first jsp</title>
</head>
<body>

<center>
<h3>Category details</h3>
	<form action="req1" method="post">
	<table>
	<tr>
	<td align="right">ID:</td>
	<td><input type="text" name="id" value="${Categories.id }"readonly="readonly"></td>
	</tr>
		<tr>
	<td align="right">Name:</td>
	<td><input type="text" name="name" value="${Categories.name }"></td>
	</tr>
	<tr>
	<td colspan="2" align ="center">
	<input type="submit" name="b1" value="Update">
	
	
	</td>
	</tr>
	</table>
	</form>
	</center>
</body>
</html>