package com.hotel.HotelService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "micro_Hotel")
public class Hotel {
    @Id
    String id;
    String name;
    String location;
    String about;
}
