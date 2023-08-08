package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ; 
    
    private String name ;
    private String catagory ; 
    private long price  ; 
    private String image ;
    
    public Product(Integer id, String name, String catagory, long price, String image) {
        this.id = id;
        this.name = name;
        this.catagory = catagory;
        this.price = price;
        this.image = image;
    } 

    public Product(String name, String catagory, long price, String image) {
        this.name = name;
        this.catagory = catagory;
        this.price = price;
        this.image = image;
    } 

    public Product() {
        super() ; 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", catagory=" + catagory + ", price=" + price + ", image="
                + image + "]";
    }

}
