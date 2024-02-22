package com.iamvickyav.springbootmvcjsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    Data data;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String getHomePage(){
        return "home";
    }

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    ModelAndView getProfilePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("profile");
        modelAndView.addObject("username",data.getUsername());
        modelAndView.addObject("password",data.getPassword());
        return modelAndView;
    }
}
