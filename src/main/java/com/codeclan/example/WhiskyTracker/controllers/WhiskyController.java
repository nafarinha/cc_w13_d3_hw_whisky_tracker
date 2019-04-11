package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> searchForWhiskiesByYear (@PathVariable int year){
        return whiskyRepository.findWhiskiesByYear(year);
    }

    @GetMapping(value = "/distillery/{name}/age/{age}")
    public List<Whisky> searchForWhiskiesByAgeAndDistilleryName (@PathVariable String name, @PathVariable int age) {
        return whiskyRepository.findWhiskiesByAgeAndDistilleryNamed(name, age);
    }

    @GetMapping(value="/region/{name}")
    public List<Whisky> searchForWhiskiesByDistilleryRegionName (@PathVariable String name) {
        return whiskyRepository.findWhiskiesByDistilleryRegionNamed(name);
    }

}
