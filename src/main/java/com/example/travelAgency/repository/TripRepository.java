package com.example.travelAgency.repository;

import com.example.travelAgency.model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends CrudRepository <Trip, Long> {

    List<Trip> findByTripName(String tripName);
    List<Trip> findAll();
}
