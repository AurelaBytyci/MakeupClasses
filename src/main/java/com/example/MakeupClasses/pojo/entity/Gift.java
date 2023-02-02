package com.example.MakeupClasses.pojo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(
        name = "gift"
)
public class Gift {

    @Id
    @Column(
            name = "Giftproducts"
    )
    private String products;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "GClientName"
    )
    private Client client;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "GLessonName"
    )
    private Lesson lesson;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "GSeatNr"
    )
    private Seat seat;



    public Gift(String products) {
        this.products = products;
    }

    public Gift() {

    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
