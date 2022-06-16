package br.com.unesp.soo.kafka.producer.controller;

import br.com.unesp.soo.kafka.producer.service.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka")
public class MessageControler {
    private final TopicProducer topicProducer;
    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody String message){

        topicProducer.send(message);
        return ResponseEntity.ok().body("Message sent successfully: " + message);
    }
}
