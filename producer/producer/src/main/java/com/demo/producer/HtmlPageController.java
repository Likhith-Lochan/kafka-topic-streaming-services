package com.demo.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlPageController {

    @GetMapping("/")
    public String index() {
        return "producer"; // maps to producer.html
    }
}
