package dev.feddema.springsecurityjwtlogin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping()
    @ResponseBody
    public String get() {
        return "Hello world!";
    }
}
