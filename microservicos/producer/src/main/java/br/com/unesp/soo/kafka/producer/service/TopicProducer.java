package br.com.unesp.soo.kafka.producer.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopicProducer {

    private static final Logger logger = LoggerFactory.getLogger(TopicProducer.class);

    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        logger.info("Payload enviado: {}", message);
        kafkaTemplate.send(topicName, message);
    }
}
