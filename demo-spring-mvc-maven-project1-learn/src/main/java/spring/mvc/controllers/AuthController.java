package spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.entities.Employee;

@Controller
@RequestMapping("/home")
public class AuthController {


    @RequestMapping(path = "/login" , method = RequestMethod.GET)
    public String login() {
        return "login_form" ; 
    }


    @RequestMapping(path = "/register" , method = RequestMethod.GET)
    public String register() {
        return "signup_form" ; 
    }
    

    @RequestMapping(path = "/login" , method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest req) {
        
        ModelAndView modelAndView = new ModelAndView()  ; 

        // old servlet way 

        String empEmail = req.getParameter("emp-email") ; 
        String empPassword = req.getParameter("emp-password") ; 
        if (empEmail.equals("test@test.com") && empPassword.equals("test")) {
            modelAndView.addObject("status", "success | email : "+empEmail+" , pass : "+empPassword) ; 
        }
        else {
            modelAndView.addObject("status", "failure | email : "+empEmail+" , pass : "+empPassword) ; 
        }



        // fetching data using @ModelAttribute annotation

        Employee employee = new Employee() ;
        





        modelAndView.setViewName("login-success");

        return modelAndView ;

    }

    // getting data using @RequestParam
    @RequestMapping(path = "/register" , method = RequestMethod.POST)
    public ModelAndView register(
        @RequestParam(name = "emp-name" , required = true) String empName  , 
        @RequestParam(name = "emp-email" , required = true) String empEmail  ,
        @RequestParam(name = "emp-password" , required = true) String empPassword  
    ) {
        
        ModelAndView modelAndView = new ModelAndView() ; 

        modelAndView.addObject("status", "success | email : "+empEmail+" , pass : "+empPassword + " , Name : "+empName) ;

        modelAndView.setViewName("register-success");


        return modelAndView ; 

    }
}
