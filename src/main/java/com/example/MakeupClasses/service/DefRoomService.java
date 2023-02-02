package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Room;
import com.example.MakeupClasses.pojo.input.RoomInput;
import com.example.MakeupClasses.repository.RoomRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefRoomService implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public DefRoomService() {
    }

    public List<Room> findAll() {
        return this.roomRepository.findAll();
    }

    public Room findRoomByNumber(Integer number) {
        return this.roomRepository.findRoomByNr(number);
    }

    public Room save(RoomInput roomInput) {
        Integer nr = roomInput.getNr();
        Integer capacity = roomInput.getCapacity();
        Room room = new Room();
        room.setNr(nr);
        room.setCapacity(capacity);
        return (Room)this.roomRepository.save(room);
    }

    public Room update(Integer nr, RoomInput roomInput) {
        Room room = this.roomRepository.findRoomByNr(nr);
        if (room == null) {
            return null;
        } else {
            Integer updatedNr = roomInput.getNr();
            Integer updatedCapacity = roomInput.getCapacity();
            room.setNr(updatedNr);
            room.setCapacity(updatedCapacity);
            return (Room)this.roomRepository.save(room);
        }
    }

    public void delete(Integer number) {
        Room room = this.roomRepository.findRoomByNr(number);
        if (room != null) {
            this.roomRepository.delete(room);
        }

        this.roomRepository.delete(room);
    }
}
