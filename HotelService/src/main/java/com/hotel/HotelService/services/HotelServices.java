package com.hotel.HotelService.services;

import com.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelServices {
    Hotel createHotel(Hotel hotel);
    List<Hotel> getAll();

    Hotel get(String id);
}
