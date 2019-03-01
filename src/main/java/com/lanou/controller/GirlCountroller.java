package com.lanou.controller;


import com.alibaba.fastjson.JSON;
import com.lanou.pojo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/girl")
public class GirlCountroller {
    @RequestMapping("/send1.do")
    public String send(HttpServletRequest request){
        request.setAttribute("a","123");
        return "girl";
    }
    @RequestMapping("/send2.do")
    public String send1(Model model){
//        model的数据会存放到request中
        model.addAttribute("b","321");
        return "girl";
    }
    @RequestMapping("/send3.do")
    public void send2(HttpServletResponse response) throws IOException {
        Dog dog=new Dog();
        dog.setAge(12);
        dog.setName("小黄");

        response.setContentType("application/json;charset=utf-8");

        String jsonString = JSON.toJSONString(dog);
        response.getWriter().write(jsonString);
    }
    //返回的内容
    //返回格式
    //转成json数据,架包jackson
    @ResponseBody
    @RequestMapping(value = "/send4.do",produces = "application/json;charset=utf-8")
    public Dog send3(HttpServletResponse response) {
        Dog dog=new Dog();
        dog.setAge(12);
        dog.setName("小黄");
        return dog;
    }


}
