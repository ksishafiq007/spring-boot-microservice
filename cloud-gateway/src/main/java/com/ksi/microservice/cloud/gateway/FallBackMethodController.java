package com.ksi.microservice.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallbackMethod(){
        return "User Service is taking longer than expected." + " Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod(){
        return "Department Service is taking longer than expected." + " Please try again later";
    }
}
