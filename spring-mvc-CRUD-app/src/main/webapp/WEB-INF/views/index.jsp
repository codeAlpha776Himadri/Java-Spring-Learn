<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.app.entity.* , java.util.* , com.app.model.* "%>

<%!
    String img = "myimage.jpeg" ; 
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring MVC CRUD App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

    <div class="container mt-2">

        <%
            Message message = (Message) request.getAttribute("Message") ;
            if (message != null && message.status.equals(STATUS.failure)) {
            %>
                <div class="alert alert-danger alert-dismissible fade show" role="alert">
                    <%= message.msg%>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            <%
            }
            else if (message != null && message.status.equals(STATUS.success)) {
            %>
                <div class="alert alert-success alert-dismissible fade show" role="alert">
                    <%= message.msg%>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            <%
            }
        %>

        <div class="row display-4 text-center py-3 my-3" id="home-header">
            Welcome to Spring Mvc Demo {Product} CRUD App
        </div>


        <!-- all products -->

        <div class="row">
            <table class="table">
                <tbody>




                    <% 
                        if (request.getAttribute("products") == null) {
                        %>
                            <h3>No products available</h3>
                        <%
                        return ; 
                        }

                        List<Product> products = (List<Product>) request.getAttribute("products") ;
                        for (Product product : products) {
                            System.out.println(product) ;
                            img = product.getImage() ;
                        %>
                            
                            <!-- individual product -->
                            <tr>
                                <div class="row p-2 pt-4 mb-2" style="background-color: rgb(245, 245, 245); border-radius: 4px;">
                                    <div class="col-md-2" >
                                        <img src="/resources/images/${img}" alt="img" style="height: 140px; width: 140px;" >
                                    </div>
                                    <div class="col-md-1"></div>
                                    <div class="col-md-6">
                                        <h5><%= product.getName()%></h5>
                                        <p><%= product.getId()%></p>
                                        <p><span class="badge bg-secondary"><%= product.getCatagory()%></span></p>
                                        <textarea class="form-control mb-2" readonly name="" id="" rows="2"><%= product.getDescription()%></textarea>
                                        <h6>Rs <%= product.getPrice()%>/-</h6>
                                    </div>
                                    <div class="col-md-2">
                                        <a class="btn btn-secondary btn-sm" href="#">Update</a>
                                        <a class="btn btn-secondary btn-sm" href="#">Delete</a>
                                    </div>
                                </div>
                            </tr>
            
                            <!-- individual product -->


                        <%
                        }
                    %>

                </tbody>
              </table>
        </div>


    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>
