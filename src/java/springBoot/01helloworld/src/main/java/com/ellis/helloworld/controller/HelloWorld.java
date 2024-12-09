package com.ellis.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ellis
 * @create 2024-11-28-下午1:31
 */
@RestController
public class HelloWorld {
//    @ResponseBody
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public  String getHello(){
        return "hello111222";
    }
}
