package com.imon.bookingservice.application.service;

import com.imon.bookingservice.application.port.in.CreateBookingUseCase;
import com.imon.bookingservice.domain.model.Booking;

public class BookingService implements CreateBookingUseCase {

    @Override
    public Booking createBooking(Booking booking) {

        return booking;

    }
}