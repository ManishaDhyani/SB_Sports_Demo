package com.gl.glosportsmanagement.controller;

import com.gl.glosportsmanagement.entity.BookingDetails;
import com.gl.glosportsmanagement.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingDetails> createBooking(@Valid @RequestBody BookingDetails bookingDetails) {
        return ResponseEntity.status(201).body(bookingService.saveBooking(bookingDetails));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDetails> fetchBookingDetails(@PathVariable Long id) {
        return ResponseEntity.ok(bookingService.getBookingDetails(id));
    }

    @GetMapping("/user/{userId}/equipment/{equipmentId}")
    public ResponseEntity<BookingDetails> FetchBookingDetailsByID(@PathVariable Long userId,@PathVariable Long equipmentId) {
        return ResponseEntity.ok(bookingService.getBookingDetailsById(userId,equipmentId));
    }
}
