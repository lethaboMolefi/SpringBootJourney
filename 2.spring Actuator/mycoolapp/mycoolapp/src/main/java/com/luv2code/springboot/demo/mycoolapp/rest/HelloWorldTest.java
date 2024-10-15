package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("different/package")
public class HelloWorldTest {

    @GetMapping("/t")
    public String sayOppo(){
        return "Hello  Wod 2";
    }
}
