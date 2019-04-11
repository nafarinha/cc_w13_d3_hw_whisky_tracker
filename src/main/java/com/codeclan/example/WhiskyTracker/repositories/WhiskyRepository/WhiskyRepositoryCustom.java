package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    //method prototypes for custom queries
    List<Whisky> findWhiskiesByAgeAndDistilleryNamed(String name, int age);

    List<Whisky> findWhiskiesByDistilleryRegionNamed(String name);
}
