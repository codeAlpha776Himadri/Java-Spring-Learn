<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Information Form</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
  <div class="container mt-5">
    <div class="col-md-8  offset-2">
        <h2 class="mb-4">New Product Add Form</h2>
        
    <form action="add-product" method="post" enctype="multipart/form-data">
      <div class="mb-3">
        <label for="productName" class="form-label">Product Name</label>
        <input  name="name"  type="text" class="form-control" id="productName" placeholder="Enter product name" required>
      </div>
      <div class="mb-3">
        <label for="productCatagory" class="form-label">Product Catagory</label>
        <select   name="catagory"  id="productCatagory" class="form-select" >
            <option selected value="electronics">Electronics</option>
            <option value="hardware">Hardware</option>
            <option value="fashion">Fashion</option>
            <option value="grooming">Grooming</option>
          </select>
      </div>
      <div class="mb-3">
        <label for="productDescription" class="form-label">Product Description</label>
        <textarea  name="description"   class="form-control" id="productDescription" rows="3" placeholder="Enter product description" required></textarea>
      </div>
      <div class="mb-3">
        <label for="productPrice" class="form-label">Product Price</label>
        <input  name="price"  type="number" class="form-control" id="productPrice" placeholder="Enter product price (Rs /-)" step="0.01" required>
      </div>
      <div class="mb-3">
        <label for="productImage" class="form-label">Product Image</label>
        <input  name="image"  type="file" class="form-control" id="productImage"  required>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    </div>
  </div>
  
  <!-- Bootstrap JS (optional, for certain features) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>
