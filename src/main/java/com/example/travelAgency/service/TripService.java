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
    public List<Trip> getAllTrip() {
        return tripRepository.findAll();
    }

    public void addTrip(Trip trip) {
        tripRepository.save(trip);
    }

    public void delete(Trip trip) {
    }
    public void saveTrip(Trip trip) {
    }
}
