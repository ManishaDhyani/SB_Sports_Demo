package com.gl.glosportsmanagement.service.impl;

import com.gl.glosportsmanagement.config.UserClient;
import com.gl.glosportsmanagement.entity.BookingDetails;
import com.gl.glosportsmanagement.exception.BookingNotFoundException;
import com.gl.glosportsmanagement.exception.InValidUserOrEquipmentDetailsException;
import com.gl.glosportsmanagement.exception.UserOrEquipmentNotAvailableException;
import com.gl.glosportsmanagement.model.UserDetails;
import com.gl.glosportsmanagement.repo.BookingRepository;
import com.gl.glosportsmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private UserClient userClient;

    @Override
    public BookingDetails saveBooking(BookingDetails bookingDetails) {

        // Checking if specific user exists or not.

        UserDetails userDetails = userClient.getUserDetails(bookingDetails.getUserId());

        // Checking for Equipment availability to make a booking.
        Boolean result = webClientBuilder.build()
                .get()
                .uri("http://localhost:8082/api/equipments/{id}/available", bookingDetails.getEquipmentId())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (result && userDetails != null) return bookingRepository.save(bookingDetails);
        else
            throw new UserOrEquipmentNotAvailableException(bookingDetails.getUserId(), bookingDetails.getEquipmentId());
    }

    @Override
    public BookingDetails getBookingDetails(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new BookingNotFoundException(id));
    }

    @Override
    public BookingDetails getBookingDetailsById(Long userId, Long equipmentId) {
        return bookingRepository.findAll().stream()
                .filter(booking -> booking.getUserId().equals(userId) && booking.getEquipmentId().equals(equipmentId))
                .findFirst().orElseThrow(() -> new InValidUserOrEquipmentDetailsException(userId, equipmentId));
    }

}
