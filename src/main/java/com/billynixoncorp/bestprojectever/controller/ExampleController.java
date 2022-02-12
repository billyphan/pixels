package com.billynixoncorp.bestprojectever.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.billynixoncorp.bestprojectever.contract.ExampleResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/exampleendpoint")
    public ExampleResource greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ExampleResource(counter.incrementAndGet(), String.format(template, name));
    }
}