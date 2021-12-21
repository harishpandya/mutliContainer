package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookKeepingController {

    @GetMapping("/getBook")
    public String getDetfault(){
        return "BookKeepingController - Default";
    }
	
	// for shutdown
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/shutdown")
    public void shutdown() {

        ((ConfigurableApplicationContext) applicationContext).close();
    }

}
