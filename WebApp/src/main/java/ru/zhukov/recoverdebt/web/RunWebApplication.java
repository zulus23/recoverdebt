package ru.zhukov.recoverdebt.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.zhukov.recoverdebt.domain.User;


@Controller
@EnableAutoConfiguration
public class RunWebApplication {


    @RequestMapping("/")
    @ResponseBody
    public String home(){
        User user = new User();
        return String.format("Test run application for user %s %n",user);
    }

    public static void main(String[] args) {
        SpringApplication.run(RunWebApplication.class,args);
    }
}
