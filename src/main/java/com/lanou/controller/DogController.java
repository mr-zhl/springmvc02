package com.lanou.controller;

import com.lanou.pojo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/dog")
public class DogController {
    @RequestMapping("/form.do")
    public String getParam(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        return "dog";
    }

    @RequestMapping("/form1.do")
    public String getParam1(@RequestParam("name") String name1, int age) {
        System.out.println("age = " + age);
        System.out.println("name = " + name1);

        Dog dog=new Dog();
        dog.setName(name1);
        dog.setAge(age);
        return "dog";
    }

    @RequestMapping("/form2.do")
    public String getParam2(Dog dog) {
        System.out.println(dog);
        return "dog";
    }


}
