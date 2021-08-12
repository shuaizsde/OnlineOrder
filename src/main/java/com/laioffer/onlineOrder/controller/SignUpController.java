package com.laioffer.onlineOrder.controller;

import com.laioffer.onlineOrder.entity.Customer;
import com.laioffer.onlineOrder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SignUpController {
    @Autowired
    private CustomerService customerService;

    //相当于 signupServlet doPost， value = /signup
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    //@ResponseStatus： 添加返回状态 200， 404 。。。
    @ResponseStatus(value = HttpStatus.CREATED)
    //@RequestBody： Convert the request body( from json)  to a java object == jackson
    public void signUp(@RequestBody Customer customer) {

    }
}
