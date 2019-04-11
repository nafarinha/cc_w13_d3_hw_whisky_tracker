package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.projections.EmbedDistillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedDistillery.class)
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {

    List<Whisky> findWiskiesByYear(int year);

    //full methods here from Impl
    List<Whisky> findWhiskiesByAgeAndDistilleryNamed(String name, int age);

    public List<Whisky> findWhiskiesByDistilleryRegionNamed(String name);
}
