package com.github.nishadnijam.springbootdockerdemo.service.impl;

import com.github.nishadnijam.springbootdockerdemo.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String fetchHelloWorld() {
        return "Hello from Nishad";
    }
}
