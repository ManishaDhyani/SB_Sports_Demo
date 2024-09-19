package com.gl.glosportsmanagement.exception;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(Long id) {
        super("Booking not found with ID: " + id);
    }
}