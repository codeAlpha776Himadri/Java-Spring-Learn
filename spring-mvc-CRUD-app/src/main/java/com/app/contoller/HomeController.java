package com.app.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class HomeController {
    
    @Autowired
    private ProductService productService ; 

    @RequestMapping("/")
    public String home() {
        Product p = new Product("test", "test", 0, "test") ;
        if (productService.addProduct(p)) {
            System.out.println("product added.....");
            p.setName("updated-name");
            p.setPrice(10000);
            if (productService.updateProduct(p)) {
                System.out.println("product updated as well......");
            }
        }
        return "index" ;
    }




}
