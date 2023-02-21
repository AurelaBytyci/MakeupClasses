package com.example.MakeupClasses.repository;
import com.example.MakeupClasses.pojo.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    //pergjegjese per menaxhimin e qendrueshmerise(read and write in database)
    List<Booking> findAll();
    Booking findBookingByNr(String nr);
}
