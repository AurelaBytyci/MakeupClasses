package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Seat;
import com.example.MakeupClasses.pojo.input.SeatInput;
import com.example.MakeupClasses.repository.SeatRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefSeatService implements SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public DefSeatService() {
    }

    public List<Seat> findAll() {
        return this.seatRepository.findAll();
    }

    public Seat findSeatByNumber(Integer number) {
        return this.seatRepository.findSeatByNumber(number);
    }

    public Seat save(SeatInput seatInput) {
        Integer number = seatInput.getNr();
        Seat seat = new Seat();
        seat.setNumber(number);
        return (Seat)this.seatRepository.save(seat);
    }

    public Seat update(Integer number, SeatInput seatInput) {
        Seat seat = this.seatRepository.findSeatByNumber(number);
        if (seat == null) {
            return null;
        } else {
            Integer updatedNumber = seatInput.getNr();
            seat.setNumber(updatedNumber);
            return (Seat)this.seatRepository.save(seat);
        }
    }

    public void delete(Integer number) {
        Seat seat = this.seatRepository.findSeatByNumber(number);
        if (seat != null) {
            this.seatRepository.delete(seat);
        }

    }

    public List<Seat> findBookedSeats() {
        return this.seatRepository.findBookedSeats();
    }
}
