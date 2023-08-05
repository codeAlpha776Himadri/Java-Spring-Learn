<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="spring.mvc.entities.* , java.util.*"%>
<%@ page isELIgnored="false"%>

<%
    Employee emp = (Employee) request.getAttribute("emp") ; 
    List<Employee> emp_list = (List<Employee>) request.getAttribute("emp-list") ;
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>
<body>
    <h1><a href="home/register">Signup Page</a></h1>
    <h1><a href="home/login">Login Page</a></h1>
    <h1><a href="about">About Page</a></h1>
    <h2>this is my first spring mvc project to begin with</h2>
    <h3>Iam hit by home controller : "/home"</h3>
    <h4>Username : ${username}</h4>
    <hr>
    <h1>Employee : </h1>
    <h4>
        Employee Id : ${emp.getEmpId()}
        <br>
        Employee Name : ${emp.getEmpName()}
    </h4>
    <hr>
    <h1>Employee List : </h1>
    <ol>
    <%
        for (Employee employee : emp_list) {
    %>
        <li>
            <%= employee%>
        </li>
    <%
        }
    %>
    </ol>
</body>
</html>