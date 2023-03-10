package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Booking;
import com.example.MakeupClasses.pojo.input.BookingInput;
import com.example.MakeupClasses.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class DefBookingService implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public DefBookingService() {
    }

    @Override
    public List<Booking> findAll() {
        return this.bookingRepository.findAll();
    }

    @Override
    public Booking findBookingByNr(String nr) {
        return this.bookingRepository.findBookingByNr(nr);
    }

    @Override
    public Booking save(BookingInput bookingInput) {
        String Nr = bookingInput.getNr();
        Date date = bookingInput.getDate();
        Time time = bookingInput.getTime();
        Booking booking = new Booking();
        booking.setNr(Nr);
        booking.setDate(date);
        booking.setTime(time);
        return (Booking)this.bookingRepository.save(booking);
    }

    @Override
    public Booking update(String nr, BookingInput bookingInput) {
        Booking booking = this.bookingRepository.findBookingByNr(nr);
        if (booking == null) {
            return null;
        } else {
            String updatedNr = bookingInput.getNr();
            Date updatedDate = bookingInput.getDate();
            Time updatedTime = bookingInput.getTime();
            booking.setNr(updatedNr);
            booking.setDate(updatedDate);
            booking.setTime(updatedTime);
            return (Booking)this.bookingRepository.save(booking);
        }
    }

    @Override
    public void delete(String nr) {
        Booking booking = this.bookingRepository.findBookingByNr(nr);
        if (booking != null) {
            this.bookingRepository.delete(booking);
        }
    }
}



