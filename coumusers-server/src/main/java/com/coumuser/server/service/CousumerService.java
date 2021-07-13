package com.coumuser.server.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCER-SERVER")
public interface CousumerService {

    @GetMapping("/demo/print/{id}")
    String print(@PathVariable("id") Integer id);

}
