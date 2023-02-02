package com.example.MakeupClasses.service;

import com.example.MakeupClasses.pojo.entity.Gift;
import com.example.MakeupClasses.pojo.input.GiftInput;
import com.example.MakeupClasses.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefGiftService implements GiftService{

    @Autowired
    private GiftRepository giftRepository;

    public DefGiftService() {
    }


    @Override
    public List<Gift> findAll() {
        return this.giftRepository.findAll();
    }

    @Override
    public Gift findGiftByProduct(String product) {
        return giftRepository.findGiftByProduct(product);
    }

    @Override
    public Gift save(GiftInput giftInput) {

        String product = giftInput.getProducts();
        Gift gift = new Gift();
        gift.setProducts(product);

        return giftRepository.save(gift);
    }

    @Override
    public Gift update(String product, GiftInput giftInput) {

        Gift gift = giftRepository.findGiftByProduct();

        if(gift == null){
            return null;
        }

        String updatedProducts = giftInput.getProducts();

        gift.setProducts(updatedProducts);

        return giftRepository.save(gift);
    }

    @Override
    public void delete(String product) {
        Gift gift = giftRepository.findGiftByProduct(product);
        if(gift != null){
            giftRepository.delete(gift);
        }
    }
}
