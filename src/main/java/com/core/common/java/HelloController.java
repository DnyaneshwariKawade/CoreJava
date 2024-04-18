package com.core.common.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @GetMapping("getName")
    public String getName() {
        return "Hello Kiran";
    }
}
