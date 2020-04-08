package com.zys.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientTest {

    @Value("${spring.application.name}")
    private String applicationName;


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/config")
    public String test(){
        String str="applicationName: "+applicationName+"\t"+"serverPort:"+serverPort;
        return str;
    }

}
