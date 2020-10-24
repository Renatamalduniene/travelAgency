package com.example.travelAgency.controllers;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TripController {
@Autowired
    private TripService tripService;
    @GetMapping("/trips")
    public String getTrips(Model model) {
        List<Trip> trips = tripService.getAllTrips();
        model.addAttribute("trips",trips);
        return "trips";

    }


}
