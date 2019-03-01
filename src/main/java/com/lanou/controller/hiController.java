package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class hiController {

//    转发,可以访问WEB-INF
    @RequestMapping("/hi.do")
    public ModelAndView sayhi(){
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/jsp/hi.jsp");
        return modelAndView;
    }

    //重定向:不能访问WEB-INF
    @RequestMapping("/world.do")
    public ModelAndView sayhi1(){
        ModelAndView modelAndView = new ModelAndView("redirect:/index.jsp");
        return modelAndView;
    }
//  前缀,后缀
    @RequestMapping("/ll.do")
    public ModelAndView sayhi2(){
        ModelAndView modelAndView = new ModelAndView("hi");
        return modelAndView;
    }

    //post.get都支持
    //@PostMapping("/lll.do")
    @GetMapping("/lll.do")
    public ModelAndView sayhi3(){
        ModelAndView modelAndView = new ModelAndView("hi");
        return modelAndView;
    }
    //简化
    @GetMapping("/llll.do")
    public String sayhi4(){
        return "hi";
    }

}
