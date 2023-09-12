package com.hotel.HotelService.controller;

import com.hotel.HotelService.entities.Hotel;
import com.hotel.HotelService.repositories.HotelRepository;
import com.hotel.HotelService.services.HotelServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
  private   HotelServices hotelServices;
   @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.createHotel(hotel));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> searchHotel(@PathVariable String id){
       return ResponseEntity.status(HttpStatus.OK).body((hotelServices.get(id)));
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
       return ResponseEntity.ok( hotelServices.getAll());
    }
}
