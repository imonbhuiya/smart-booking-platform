package com.imon.bookingservice.domain.repository;

import com.imon.bookingservice.domain.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingRepository {
    Booking save(Booking booking);

    Optional<Booking> findById(Long id);

    List<Booking> findAll();

    void deleteById(Long id);
}
