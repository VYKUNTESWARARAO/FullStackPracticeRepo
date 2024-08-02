<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1 style="color:red;text-align:center">Student Registration form</h1>
	<form action="register" method="post">
		<table align="center" bgcolor="blue" style="color:white">
		<tr>
		<td>Student Number</td>
		<td><input type="text" name="sNo"></td>
		</tr>
		<tr>
		<td>Student Name</td>
		<td><input type="text" name="sName"></td>
		</tr>
		<tr>
		<td>Student Address</td>
		<td><input type="text" name="sAddr"></td>
		</tr>
		<tr>
		<td>Student Grade</td>
		<td><input type="text" name="sGrade"></td>
		</tr>
		<tr>
		<td><input type="submit"></td>
		</tr>
		
		</table>
	</form>
</body>
</html>