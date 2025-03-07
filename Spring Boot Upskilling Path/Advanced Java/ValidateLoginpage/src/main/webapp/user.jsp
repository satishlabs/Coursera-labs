<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Accept User Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }
        .valid {
            color: green;
            font-weight: bold;
        }
        .invalid {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Verifying Details</h1>
        <jsp:useBean id="st" class="com.stud.ValidateUser" />
        <jsp:setProperty name="st" property="user"/>
        <jsp:setProperty name="st" property="pass"/>

        <p><strong>User name:</strong> <jsp:getProperty name="st" property="user"/></p>
        <p><strong>Password:</strong> <jsp:getProperty name="st" property="pass"/></p>

        <% if(st.validate("admin","1234")) { %>
            <p class="valid">Welcome! You are a Valid User</p>
        <% } else { %>
            <p class="invalid">Error! You are an Invalid User</p>
        <% } %>
    </div>
</body>
</html>
