<%@page language="java"  contentType="text/html"  pageEncoding="UTF-8"%>
<%@page import="spring.mvc.entities.* , java.util.* , java.lang.* "%>

<%
    Employee emp = (Employee) request.getAttribute("emp") ;
    List<Employee> emp_list = (List<Employee>) request.getAttribute("emp-list") ;
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About</title>
</head>
<body>
    <h2>I am about page</h2>
    <h4>Username : <%= (String) request.getAttribute("username")%></h4>
    <hr>
    <h1>Employee : </h1>
    <h4>
        Employee Id : <%= emp.getEmpId()%>
        <br>
        Employee Name : <%= emp.getEmpName()%>
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