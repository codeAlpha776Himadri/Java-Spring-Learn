<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Form</title>
</head>
<body>
    
    <h2>Register here...</h2>
    <hr>
    <form action="register" method="post">

        <table>
            <tr>
                <td><label for="emp-name">Employee Name :</label></td>
                <td><input type="text" name="emp-name" id="emp-name"></td>
            </tr>
            <tr>
                <td><label for="emp-email">Employee Email :</label></td>
                <td><input type="email" name="emp-email" id="emp-email"></td>
            </tr>
            <tr>
                <td><label for="emp-password">Employee Password :</label></td>
                <td><input type="password" name="emp-password" id="emp-password"></td>
            </tr>
            <tr>
                <td><button type="submit">Submit</button></td>
            </tr>
        </table>

        
    </form>

</body>
</html>