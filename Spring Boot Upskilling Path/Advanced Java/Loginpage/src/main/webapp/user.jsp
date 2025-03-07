<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String name = request.getParameter("user");
String pass = request.getParameter("pass");
out.print("Hi, You have entered you name as "+name);
%>
</body>
</html>