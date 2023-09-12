package com.hotel.RatingServices.repository;

import com.hotel.RatingServices.enties.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
