package com.demo.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        Random random=new Random();
//        RiderLocation   location=new RiderLocation("rider123", random.nextFloat()*random.nextInt(1,100), random.nextFloat()*random.nextInt(1,100));

        this.kafkaTemplate.send("my-new-topic","Message : "+message);
        return "Message sent : "+ message;

    }

}
