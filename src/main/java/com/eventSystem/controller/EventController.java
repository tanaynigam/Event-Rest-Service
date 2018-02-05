package com.eventSystem.controller;

import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.eventSystem.model.Event_data;
import com.eventSystem.Service.EventRepository;

@Controller
@RequestMapping(path="/demo")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewEvent (@RequestParam String name, @RequestParam String description, @RequestParam Instant start, @RequestParam String timezone, @RequestParam Instant end, @RequestParam String currency, @RequestParam int capacity) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request


        Event_data n = new Event_data();
        n.setName(name);
        n.setStart_time(start);
        n.setEnd_time(end);
        n.setStart_timezone(timezone);
        n.setEnd_timezone(timezone);
        n.setCurrency(currency);
        n.setCapacity(capacity);
        n.setDescription(description);

        eventRepository.save(n);

        System.out.println("add");
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Event_data> getAllEvents() {
        // This returns a JSON or XML with the users
        System.out.println("findall");
        return eventRepository.findAll();
    }
}