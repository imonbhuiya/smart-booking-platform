package com.imon.bookingservice.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private Long id;

    // Customer information
    private String customerName;

    // Hotel information
    private String hotelName;
    private Integer roomNumber;

    // Booking dates
    private LocalDate checkIn;
    private LocalDate checkOut;

    // Metadata
    private BookingStatus status;
    private LocalDateTime createdAt;
}
