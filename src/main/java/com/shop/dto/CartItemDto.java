package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Getter @Setter
public class CartItemDto {

    @NotNull(message = "item id is required.")
    private Long itemId;

    @Min(value = 1, message = "at least one item is required")
    private int count;

}