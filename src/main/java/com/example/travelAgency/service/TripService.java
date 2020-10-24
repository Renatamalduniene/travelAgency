package com.example.travelAgency.service;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }
    public List<Trip> getAllTrips() {
        return (List<Trip>) tripRepository.findAll();
    }
}
