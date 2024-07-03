package Javaproject.example.Newjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// controller layer  used to develop a rest api
@Controller
//
// @RestController  //for rest api
@RequestMapping("/mvc/")
public class UserController {

    @RequestMapping("/digb")
       // @ResponseBody  // Method
        public String helloGFG()
        {  System.err.println("controller is here");
                return "Div1.jsp";  }

       // @RequestMapping( value = "/demo", method = {RequestMethod.GET,RequestMethod.POST})
        @RequestMapping("/demo")
       // @ResponseBody
        public String getViewws() {
                return "formPage.jsp";
         }

         @RequestMapping("/register")
          public  String getRegister(){
          return "Div1.jsp";
           }
    @RequestMapping("/webster")
    public  String getwebster(){
        return "ForgotPassword.jsp";
    }



}
