package com.example.MakeupClasses.repository;
import com.example.MakeupClasses.pojo.entity.Gift;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GiftRepository extends CrudRepository<Gift, String> {

    List<Gift>findAll();
    Gift findGiftByProduct(String product);
    @Query(
            "SELECT g FROM Gift g"
    )
    //SELECT `Products` FROM `gift` join `booking` on Products=booking.BookingNr;
    Gift findGiftByProduct();
}
