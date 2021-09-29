package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, @RequestParam(value = "surname", required = false) String surname) {
        String name = request.getParameter("name");
        System.out.println(name + " " + surname);
        return "/first/hello";
    }

    @GetMapping("/goodbye")
    public String godByePage() {

        return "/first/goodbye";
    }
}
