package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CartDetailDto {

    private Long cartItemId;

    private String itemName;

    private int price;

    private int count;

    public CartDetailDto(Long cartItemId, String itemName, int price, int count){
        this.cartItemId = cartItemId;
        this.itemName = itemName;
        this.price = price;
        this.count = count;
    }

}