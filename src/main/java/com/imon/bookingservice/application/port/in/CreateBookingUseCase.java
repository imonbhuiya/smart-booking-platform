package com.imon.bookingservice.application.port.in;

import com.imon.bookingservice.domain.model.Booking;

public interface CreateBookingUseCase {
    Booking createBooking(Booking booking);
    }


