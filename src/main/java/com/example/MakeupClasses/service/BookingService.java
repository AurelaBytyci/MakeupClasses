package com.example.MakeupClasses.service;
import com.example.MakeupClasses.pojo.entity.Booking;
import com.example.MakeupClasses.pojo.input.BookingInput;

import java.util.List;

public interface BookingService {

    //implementimin e logjikes se biznesit ne aplikacion(procesimin dhe transformimin e te dhenave)
    List<Booking> findAll();

    Booking findBookingByNr(String nr);

    Booking save(BookingInput bookingInput);

    Booking update(String nr, BookingInput bookingInput);

    void delete(String nr);
}
