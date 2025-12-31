package com.example.abhinav.annotation.services;

import org.springframework.stereotype.Component;

@Component
public class CartServiceImpl2 implements CartService{

    @Override
    public void addToCart() {
        System.out.println("adding to cart - impl 2");
    }
}
