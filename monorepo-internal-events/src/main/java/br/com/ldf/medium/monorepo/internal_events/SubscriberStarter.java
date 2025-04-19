package br.com.ldf.medium.monorepo.internal_events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberStarter {
    public static void main(String[] args) {
        SpringApplication.run(SubscriberStarter.class, args);
    }
}
