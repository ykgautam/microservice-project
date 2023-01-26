package com.lcwd.rating.controllers;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    // create rating
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        String uniqueRatingId = UUID.randomUUID().toString();
        rating.setRatingId(uniqueRatingId);
        Rating rating1 = this.ratingService.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    // get all rating
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating() {
        return ResponseEntity.ok(this.ratingService.getAllRatings());
    }

    // get all ratings by userId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(this.ratingService.getAllRatingsByUserId(userId));
    }

    // get all ratings by hotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(this.ratingService.getAllRatingsByHotelId(hotelId));
    }

}
