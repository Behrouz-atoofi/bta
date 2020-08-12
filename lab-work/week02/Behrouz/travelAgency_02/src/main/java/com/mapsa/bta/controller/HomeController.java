package com.mapsa.bta.controller;

import com.mapsa.bta.model.userDto;
import com.mapsa.bta.services.RegisterService;
import com.mapsa.bta.services.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String gotoIndex() {
        return "index";
    }

    @RequestMapping("/login")
    public String gotoLogin() {
        return "login";
    }

    @Autowired
    private loginService loginService;
    @Autowired
    private RegisterService registerService;

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam String email, @RequestParam String password) throws SQLException {

        if (loginService.Authenticate(email, password))
            return "index";
        return "login";
    }

    @RequestMapping("/registerUser")
    @ResponseBody
    public String registerUSer(
            @RequestParam String name,
            @RequestParam String family,
            @RequestParam String password,
            @RequestParam String email
            , @RequestParam long phonenumber) throws SQLException {

        userDto userDto = new userDto();
        userDto.setName(name);
        userDto.setFamily(family);
        userDto.setPassword(password);
        userDto.setEmail(email);
        userDto.setPhoneNumber(phonenumber);
        registerService.adduser(userDto) ;

            return  "Registerd successfully !"  ;


    }





}
