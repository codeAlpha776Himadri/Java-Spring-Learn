package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductDaoImpl;
import com.app.model.Product;

@Service
public class ProductService {
    
    
    @Autowired
    private ProductDaoImpl productDao ;




    public boolean addProduct(Product p) {
        return this.productDao.addProduct(p) ;
    }

    public List<Product> getProducts() {
        return this.productDao.getProducts() ;
    }

    public boolean deleteProduct(int id) {
        return this.productDao.deleteProduct(id) ;
    }

    public boolean updateProduct(Product p) {
        return this.productDao.updateProduct(p) ;
    }






    public ProductDaoImpl getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDaoImpl productDao) {
        this.productDao = productDao;
    } 

    

}
