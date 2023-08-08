package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate ht ;

    @Transactional
    @Override
    public boolean addProduct(Product product) {
        boolean isAdded = false ; 
        try {
            this.ht.save(product) ;
            isAdded = true ; 

        } catch (Exception e) {
            e.printStackTrace() ;
        }
        return isAdded ; 
    }

    @Transactional
    @Override
    public boolean deleteProduct(int id) {
        boolean isDeleted= false ; 
        try {
            Product p = this.ht.load(Product.class , id);
            this.ht.delete(p);
            isDeleted= true ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted ; 
    }

    @Override
    public List<Product> getProducts() {
        return this.ht.loadAll(Product.class) ;
    }

    @Transactional
    @Override
    public boolean updateProduct(Product p) {
        boolean isUpdated=false ;
        try {
            this.ht.update(p);
            isUpdated=true ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated ;
    }


    
    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
    
}
