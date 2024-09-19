package com.gl.glosportsmanagement.service;

import com.gl.glosportsmanagement.entity.BookingDetails;

public interface BookingService {

    BookingDetails saveBooking(BookingDetails user);

    BookingDetails getBookingDetails(Long id);

    BookingDetails getBookingDetailsById(Long userId, Long equipmentId);
}
