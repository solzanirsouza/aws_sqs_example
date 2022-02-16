package com.codesqsspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


@SpringBootApplication
public class SqsSpringBootApplication {

    private static final Logger log = LoggerFactory.getLogger(SqsSpringBootApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SqsSpringBootApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();

        log.info("\n\n\t---------------------------------\n\t" +
                ":: AWS-SQS Example running :: " + environment.getProperty("server.port") + " ::" +
                "\n\t------------------------------------\n\t");
    }
}
