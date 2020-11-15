<!--
  Author: Donald Trowbridge
  Date: 11/12/2020
  Class: CST235-O500
  Statement: This work is my own.
 -->
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Form</title>
</head>
<body>
	<form action="/assignment2a/TestServlet" method="post">
		<label>First name: </label>
		<input type="text" id="firstname" name="firstname">
		<br />
		<label>Last name: </label>
		<input type="text" id="lastname" name="lastname">
		<br />
		<input type="submit" value="Submit">
	</form>
</body>
</html>