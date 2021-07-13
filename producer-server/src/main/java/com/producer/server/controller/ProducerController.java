package com.producer.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


    @GetMapping("/demo/print/{id}")
   public String print(@PathVariable("id")Integer id){
        return  id+"<----------请求成功";
    }

}
