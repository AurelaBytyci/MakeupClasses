package com.example.MakeupClasses.repository;

import com.example.MakeupClasses.pojo.entity.Seat;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Integer> {

    Seat findSeatByNumber(Integer number);
    List<Seat> findBookedSeats();

    
    @Query("select s from Seat s join fetch Booking b on s.number=b.seat.number")
     List<Seat> findAll();

    void delete(Seat seat);
}
