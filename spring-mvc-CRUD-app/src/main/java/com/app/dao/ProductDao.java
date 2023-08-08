package com.app.dao;

import java.util.List;

import com.app.model.Product;

public interface ProductDao {
    public boolean addProduct(Product product) ; 
    public List<Product> getProducts() ; 
    public boolean deleteProduct(int id) ; 
    public boolean updateProduct(Product p) ;    
}
