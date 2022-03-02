package com.example.HotelReservation.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.HotelReservation.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {
}
