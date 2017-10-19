package ru.zhukov.recoverdebt.web;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.zhukov.recoverdebt.domain.User;


@Controller
@SpringBootApplication(scanBasePackages = "ru.zhukov.recoverdebt")
public class RunWebApplication  extends WebMvcConfigurerAdapter {



    @RequestMapping("/")
    @ResponseBody
    public String home(){
        User user = new User();
        return String.format("Test run application for user %s %n",user);
    }
    @GetMapping("/login")
    public String login(){
        return "/login";
    }


    @RequestMapping("/users")
    @ResponseBody
    public String user(){
        return "user";
    }

    public static void main(String[] args) {
        SpringApplication.run(RunWebApplication.class,args);
    }



}
