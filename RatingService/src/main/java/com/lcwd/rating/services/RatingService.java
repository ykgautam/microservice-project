package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all rating
    List<Rating> getAllRatings();

    // get all rating by user
    List<Rating> getAllRatingsByUserId(String userId);

    // get all by hotel
    List<Rating> getAllRatingsByHotelId(String hotelId);
}
