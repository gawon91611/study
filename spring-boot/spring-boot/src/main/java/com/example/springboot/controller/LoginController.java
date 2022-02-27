package com.example.springboot.controller;

import com.example.springboot.bean.LoginRequestBean;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    UserRepository repository;

    @GetMapping("/user/login")
    @ResponseBody
    public Map<String,String> login(@Valid LoginRequestBean bean) {
        Map<String,String> response = new HashMap<>();

        Integer count = repository.countByLoginIdAndPassword(bean.getLoginId() ,bean.getPassword());

        if(count.equals(1)){
            response.put("result", "0000");
        }else {
            response.put("result", "2000");
            response.put("message", "login failed");
            //update about login fail count and fail time
        }
        return response;
    }

}
