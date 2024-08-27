package com.digit.Ecommerce007.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


public class Cart {

    @Id
    @GeneratedValue
    private long cart_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    private long quantity;
    private long totalPrice;


}
