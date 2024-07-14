package com.joao.planner.trip;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripsController {
    private TripRepository tripRepository;

    public ResponseEntity<String> createTrips(@RequestBody TripRequestPayload payload){
        Trip newTrip = new Trip(payload);
        this.tripRepository.save(newTrip);

    }
}
