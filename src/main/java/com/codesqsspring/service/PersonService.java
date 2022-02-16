package com.codesqsspring.service;

import com.codesqsspring.model.message.PersonMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class PersonService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endPoint;

    public void send(final String name, final Integer age) {
        logger.info("Send person to AWS SQS");
        queueMessagingTemplate.convertAndSend(endPoint, new PersonMessage(name, age));
    }

    public void show(String name, Integer age) {
        logger.info(format("A recovered person on AWS SQS: Name %s and Age %d", name, age));
    }
}
