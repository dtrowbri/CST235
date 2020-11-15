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
<title>Test Response</title>
</head>
<body>
<h3>First name: <%=request.getAttribute("firstname") %></h3>
<h3>Last name: <%=request.getAttribute("lastname") %></h3>



</body>
</html>