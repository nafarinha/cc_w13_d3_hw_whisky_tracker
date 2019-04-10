package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    List<Whisky> findWiskiesByYear(int year);

    //TODO: Put full method here from Impl
    List<Whisky> findWhiskiesByAgeAndDistilleryNamed(String name, int age);
}
