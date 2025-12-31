package com.example.abhinav.annotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    public CartService getCartService() {
        return cartService;
    }
    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }


    public ProductService getProductService() {
        return productService;
    }
    public void setProductService(ProductService productService) {
        this.productService = productService;

    }
}
