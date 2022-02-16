package com.codesqsspring.consumer;

import com.codesqsspring.model.message.PersonMessage;
import com.codesqsspring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class PersonConsumer {

    @Autowired
    private PersonService service;

    @SqsListener("messageQueue")
    public void onMessage(final PersonMessage message) {
        service.show(message.getName(), message.getAge());
    }
}
