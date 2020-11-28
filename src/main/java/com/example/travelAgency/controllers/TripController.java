package com.example.travelAgency.controllers;

import com.example.travelAgency.model.Trip;
import com.example.travelAgency.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripRepository tripRepository;

    @GetMapping("/")
    public String showInitialScreen(Model model) {
        List<Trip> trips = tripRepository.findAll();
        model.addAttribute("trips", trips);
        return "trips";
    }

    @GetMapping("/addtripview")
    public String addTripView(Model model) {
        Trip trip = new Trip();
        model.addAttribute("trip", trip);
        return"addtrip";
    }

    @GetMapping("/addtrip")
    public String addTrip(Trip trips, BindingResult result, Model model){
         tripRepository.save(trips);
         model.addAttribute("trips", tripRepository.findAll());
         return "/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrip(@PathVariable("id") long id, Model model) {
        Trip trip = tripRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Invalid trip id: " + id));

        tripRepository.delete(trip);
        model.addAttribute("trips", tripRepository.findAll());
        return "trips";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Trip trip = tripRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        model.addAttribute("trips", trip);
        return "trip-edit";
    }

    @PostMapping("/update/{id}")
    public String updateTrip(@PathVariable("id") long id, Model model, Trip trip, BindingResult result) {
        tripRepository.save(trip);
        model.addAttribute("trips", tripRepository.findAll());
        return "trips";
    }
}
