package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Seat;
import com.example.MakeupClasses.pojo.input.SeatInput;
import java.util.List;

public interface SeatService {
    List<Seat> findAll();

    Seat findSeatByNumber(Integer number);

    Seat save(SeatInput seatInput);

    Seat update(Integer number, SeatInput seatInput);

    void delete(Integer number);

    List<Seat> findBookedSeats();
}
