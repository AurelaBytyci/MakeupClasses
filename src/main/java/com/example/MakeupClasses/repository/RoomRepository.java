package com.example.MakeupClasses.repository;

import com.example.MakeupClasses.pojo.entity.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {
    @Query("SELECT r FROM Room r")
    List<Room> findAll();

    Room findRoomByNr(Integer roomNumber);
}
