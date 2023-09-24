package com.app.contoller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.Message;
import com.app.entity.STATUS;
import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class HomeController {
    
    @Autowired
    private ProductService productService ; 

    @RequestMapping("/")
    public String home(Model m) {
        List<Product> products = productService.getProducts() ;
        m.addAttribute("products", products) ;
        return "index" ;
    }

    @RequestMapping(path = "/add-product" , method = RequestMethod.GET)
    public String handleAddProduct() {
        return "add-product" ;
    }


    @RequestMapping(path = "/add-product" , method = RequestMethod.POST)
    public ModelAndView handleAddProduct(
        @RequestParam("name")  String name , 
        @RequestParam("catagory")  String catagory ,
        @RequestParam("description")  String description ,
        @RequestParam("price")  String price ,
        @RequestParam("image") CommonsMultipartFile file , 
        HttpSession s 
    ) {
        ModelAndView mv= new ModelAndView() ;
        Message m = new Message() ; 
        Product p = new Product(
            name,
            catagory, 
            description, 
            Float.parseFloat(price), 
            file.getOriginalFilename()
        ) ;

        if (productService.addProduct(p)) {

            String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator 
                          + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename() ;

            byte[] data = file.getBytes(); 
            boolean isUploaded =false ;

            try {
                FileOutputStream fos = new FileOutputStream(path) ; 
                fos.write(data);
                fos.close();
                isUploaded=true ; 
            } catch (Exception e) {
                e.printStackTrace();
                m.status = STATUS.failure ;
                m.msg = "cant add product! "+e.getMessage() ;
            }

            if (isUploaded) {
                m.status = STATUS.success ;
                m.msg = "product successfully added!!" ; 
            }           

        }
        else {
            m.status = STATUS.failure ;
            m.msg = "cant add product! try again..." ;
        }
        
        mv.addObject("Message", m) ;
        mv.setViewName("index");

        return mv ;
    }



}
