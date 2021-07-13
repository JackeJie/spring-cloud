package com.coumuser.server.controller;

import com.coumuser.server.service.CousumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CousumerController {


    @Autowired
    private CousumerService cousumerService;

    @GetMapping("/demo/{id}")
    public String get(@PathVariable("id")Integer id){
        String print = cousumerService.print(id);
        return "打印----->"+print;
    }

}
