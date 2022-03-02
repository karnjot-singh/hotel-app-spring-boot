package com.example.HotelReservation.controller;


import com.example.HotelReservation.entity.Hotel;
import com.example.HotelReservation.repository.HotelRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping(path="/hotels")
    public @ResponseBody Iterable<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping(path="/hotels/add")
    public @ResponseBody ResponseEntity<String> addNewHotel (@RequestBody Hotel hotel) {

        hotelRepository.save(hotel);

        return new ResponseEntity<String>("Hotel Data Saved!!!", HttpStatus.CREATED);
    }
}
