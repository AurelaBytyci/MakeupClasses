package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Gift;
import com.example.MakeupClasses.pojo.input.GiftInput;

import java.util.List;

public interface GiftService {
    List<Gift> findAll();
    
    Gift findGiftByProduct(String product);

    Gift save(GiftInput giftInput);

    Gift update(String product, GiftInput giftInput);

    void delete(String product);
}
