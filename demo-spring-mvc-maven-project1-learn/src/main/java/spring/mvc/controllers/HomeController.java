package spring.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.entities.Employee;

@Controller
public class HomeController {
    

    @RequestMapping(path = {"/"} , method = RequestMethod.GET)  // although by default will also be get req
    public String home(Model model) {
        System.out.println("home controller!!");


        /*  data export by MODEL object  -  start */

        model.addAttribute("username", "Himadri") ;
        model.addAttribute("emp", new Employee(101,"Pritam", "pritam@gmail.com", "990kkl")) ;

        List<Employee> employees = new  ArrayList<Employee>() ;
        employees.add(new Employee(103, "Sukanta" , "suk@gmail.com", "112$$")) ;
        employees.add(new Employee(104, "Suchi" , "suchi@gmail.com" , "22EE344*")) ;

        model.addAttribute("emp-list", employees) ;


        /*  data export by MODEL object - end */


        return "index" ;
    }



    /*  data export to view by MODEL AND VIEW object */

    @RequestMapping(path = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
        System.out.println("about controler");


        /*  data export by MODEL AND VIEW object  -  start */

        ModelAndView modelAndView = new ModelAndView() ;

        modelAndView.addObject("username", "Himadri") ;
        
        // set the view name
        modelAndView.setViewName("about");

        modelAndView.addObject("emp", new Employee(101,"Pritam", "pritam@gmail.com", "990kkl")) ;

        List<Employee> employees = new  ArrayList<Employee>() ;
        employees.add(new Employee(103, "Sukanta" , "suk@gmail.com", "112$$")) ;
        employees.add(new Employee(104, "Suchi" , "suchi@gmail.com" , "22EE344*")) ;

        modelAndView.addObject("emp-list", employees) ;


        /*  data export by MODEL AND VIEW object  -  end */


        return modelAndView ;
    }



}
