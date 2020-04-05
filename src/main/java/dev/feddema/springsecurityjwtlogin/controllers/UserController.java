package dev.feddema.springsecurityjwtlogin.controllers;

import dev.feddema.springsecurityjwtlogin.domain.dto.UserDto;
import dev.feddema.springsecurityjwtlogin.exceptions.UniqueValueExistsException;
import dev.feddema.springsecurityjwtlogin.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void login(@RequestBody UserDto user) throws UniqueValueExistsException {
        userService.register(user.getUsername(), user.getPassword());
    }
}
