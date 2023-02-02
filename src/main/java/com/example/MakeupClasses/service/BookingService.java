package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Booking;
import com.example.MakeupClasses.pojo.input.BookingInput;

import java.util.List;

public interface BookingService {
    List<Booking> findAll();

    Booking findBookingByNr(String nr);

    Booking save(BookingInput bookingInput);

    Booking update(String nr, BookingInput bookingInput);

    void delete(String nr);
}
