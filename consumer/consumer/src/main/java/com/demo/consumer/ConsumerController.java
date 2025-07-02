package com.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/api")
public class ConsumerController {
    @Autowired
    private KafkaConsumer kafkaConsumer;

    @GetMapping("/messages")
    public String getMessages(Model model) {
        model.addAttribute("messages", kafkaConsumer.getMessages());
        return "messages"; // corresponds to messages.html
    }
}
