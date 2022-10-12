package com.example.userservice.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {


    private Environment env;

    public UserController(Environment env) {
        this.env = env;
    }

    @GetMapping("/health_check")
    public String status(){

        return "USER-SERVICE 입니다";
    }
}
