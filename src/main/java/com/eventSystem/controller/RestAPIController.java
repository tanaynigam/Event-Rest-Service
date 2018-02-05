package com.eventSystem.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

import com.eventSystem.model.Event;

@RestController
//@RequestMapping(path="/demo")
public class RestAPIController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/latestEvents")
    public Event latestEvents(@RequestParam(value = "name", defaultValue = "World") String name) {

        System.out.println("latestevent");
        return new Event();
    }
}