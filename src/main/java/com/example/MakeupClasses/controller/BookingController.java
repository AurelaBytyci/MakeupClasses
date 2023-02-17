package com.example.MakeupClasses.controller;
import com.example.MakeupClasses.pojo.entity.Booking;
import com.example.MakeupClasses.pojo.input.BookingInput;
import com.example.MakeupClasses.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping("/booking")
    public List<Booking> getBookings() {
        return bookingService.findAll();
    }

    @GetMapping("/booking/{nr}")
    public Booking getBookingByNr(@PathVariable String nr){
        return bookingService.findBookingByNr(nr);
    }

    @PostMapping("/booking")
    public Booking insertNewBooking(@RequestBody BookingInput bookingInput){

        return bookingService.save(bookingInput);
    }
    @PutMapping("booking/{nr}")
    public Booking updateBooking(@PathVariable String nr,
                               @RequestBody BookingInput bookingInput){

        return bookingService.update(nr, bookingInput);
    }
    @DeleteMapping("booking/{nr}")
    public Boolean deleteBooking(@PathVariable String nr){
        bookingService.delete(nr);
        return true;
    }
}
