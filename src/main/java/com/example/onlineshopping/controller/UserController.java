package com.example.onlineshopping.controller;

import com.example.onlineshopping.entity.User;
import com.example.onlineshopping.service.impl.UserServiceImpl;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/index")
    public String index(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user",user);

        return "index";
    }


    @GetMapping("/login")
    public String login() {
        return "html/login";
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("userName") String username,
                              @RequestParam("passWord") String password
                              ) {
        ModelAndView modelAndView = new ModelAndView();
        HashMap<String,Object> map = new HashMap<>();
        User user = userService.findByuserNameAndpassword(username, password);
        if (user.equals(null)) {
            map.put("errors","error");
            modelAndView.setViewName("/html/login");
            modelAndView.addAllObjects(map);
            return modelAndView;
        }
        map.put("user",user);
        modelAndView.setViewName("redirect:index");
        modelAndView.addAllObjects(map);


        return modelAndView ;


    }


}
