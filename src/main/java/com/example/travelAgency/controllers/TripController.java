package com.example.travelAgency.controllers;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping("/trips")
    public List<Trip> getTrips(Model model) {
        List<Trip> trips = tripService.getAllTrip();
        model.addAttribute("trip", trips);
        return trips;
    }

    @PostMapping("/addtrip")
    public String addTrip(@RequestBody Trip trip) {
        tripService.addTrip(trip);
        return "trip added";
    }

    @DeleteMapping("/deletetrip")
    public String deleteTrip(@RequestBody Trip trip) {
        tripService.delete(trip);
        return "trip deleted";
    }

    @PutMapping("/edittrip")
    public String editTrip(@RequestBody Trip trip) {
        tripService.saveTrip(trip);
        return "trip edited";
        //tripService.getAllTrip();
    }
}
