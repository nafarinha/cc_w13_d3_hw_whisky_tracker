package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;

import java.util.List;

public interface DistilleryRepositoryCustom {

    //method prototypes for custom queries
    List<Distillery> findDistilleriesByWhiskiesAged12();


}
