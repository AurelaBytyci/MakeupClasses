package com.example.MakeupClasses;

import com.example.MakeupClasses.pojo.entity.*;
import com.example.MakeupClasses.repository.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MakeupClassesApplicationTests {

	@Autowired
	ClientRepository clientRepository;
	@Autowired
	LessonRepository lessonRepository;
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	SeatRepository seatRepository;

	@Autowired
	GiftRepository giftRepository;

	MakeupClassesApplicationTests() {
	}

	@Test
	public void saveClientTest() {
		Client client = new Client("Adea","Selmani", "adeaselmani@gmail.com");
		this.clientRepository.save(client);
		assertNotNull(this.clientRepository.findClientByName("Adea"));
	}

	@Test
	public void updateClientTest() {
		Client client = this.clientRepository.findClientByName("Dije");
		client.setEmail("dije.livareka@gmail.com");
		this.clientRepository.save(client);
		assertEquals("dije.livareka@gmail.com", client.getEmail());
	}

	@Test
	public void deleteClientTest() {
		Client client = this.clientRepository.findClientByName("Adea");
		this.clientRepository.delete(client);
		assertNull(this.clientRepository.findClientByName("Adea"));
	}

	@Test
	public void saveLessonTest() {
		Lesson lesson = new Lesson("Makeup by Mario", "Facial anatomy");
		this.lessonRepository.save(lesson);
		assertNotNull(lesson);
	}

	@Test
	public void updateLessonTest() {
		Lesson lesson = this.lessonRepository.findLessonByName("Makeup by Mario");
		lesson.setCategory("Facial anatomy");
		this.lessonRepository.save(lesson);
		assertNotEquals("Facial anatomy", lesson.getCategory());
	}

	@Test
	public void deleteLessonTest() {
		Lesson lesson = this.lessonRepository.findLessonByName("Makeup by Mario");
		this.lessonRepository.delete(lesson);
		assertNull(this.lessonRepository.findLessonByName("Makeup by Mario"));
	}


	@Test
	public void saveRoomTest() {
		Room room = new Room(1, 65);
		this.roomRepository.save(room);
		assertNotNull(room);
	}

	@Test
	public void updateRoomTest() {
		Room room = this.roomRepository.findRoomByNr(5);
		room.setCapacity(65);
		this.roomRepository.save(room);
		assertEquals("65", room.getCapacity().toString());
	}

	@Test
	public void deleteRoomTest() {
		Room room = this.roomRepository.findRoomByNr(5);
		this.roomRepository.delete(room);
		assertNull(this.roomRepository.findRoomByNr(5));
	}

	@Test
	public void saveSeatTest() {
		Seat seat = new Seat(40);
		this.seatRepository.save(seat);
		assertNotNull(seat);
	}

	@Test
	public void updateSeatTest() {
		Seat seat = this.seatRepository.findSeatByNumber(40);
		seat.setNumber(41);
		this.seatRepository.save(seat);
		assertEquals("41", seat.getNumber().toString());
	}

	@Test
	public void deleteSeatTest() {
		Seat seat = this.seatRepository.findSeatByNumber(41);
		this.seatRepository.delete(seat);
		assertNull(this.seatRepository.findSeatByNumber(41));
	}

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void saveBookingTest(){
		Booking booking = new Booking();
		bookingRepository.save(booking);
		assertNotNull(booking);
	}

	@Test
	public void updateBookingTest(){
		Booking booking = bookingRepository.findBookingByNr("211");
		bookingRepository.save(booking);
		booking.setNr("211");
		assertNotEquals("311", booking.getNr());
	}

	@Test
	public void deleteBookingTest() {
		Booking booking = bookingRepository.findBookingByNr("223");
		bookingRepository.delete(booking);
		assertNull(bookingRepository.findBookingByNr("223"));
	}

	@Test
	public void saveGiftTest(){
		Gift gift = new Gift("Moisturizer");
		giftRepository.save(gift);
		assertNotNull(gift);
	}

	@Test
	public void updateGiftTest(){
		Gift gift = giftRepository.findGiftByProducts("EyeCream");
		gift.setProducts("LipBalm");
		giftRepository.save(gift);
		assertEquals("LipBalm", gift.getProducts().toString());
	}

	@Test
	public void deleteGiftTest(){
		Gift gift = giftRepository.findGiftByProducts("LipBalm");
		giftRepository.delete(gift);
		assertNull(giftRepository.findGiftByProducts("LipBalm"));
	}
}
