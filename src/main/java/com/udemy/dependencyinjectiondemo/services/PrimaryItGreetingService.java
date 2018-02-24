package com.udemy.dependencyinjectiondemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("it")
public class PrimaryItGreetingService implements GreetingService{

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getItalianGreeting();
    }
}
