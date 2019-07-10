package com.redhat.demospringboot;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	Logger log=Logger.getLogger(this.getClass().getName());

    @RequestMapping("/")
    public String index() {
    	log.info("in service 2");
        return "This is Service 2";
    }
    
}
