package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Getter @Setter
public class OrderDto {

    @NotNull(message = "Item Id  is required.")
    private Long itemId;

    @Min(value = 1, message = "Min number of order is 1.")
    @Max(value = 999, message = "Max number of order is 1.")
    private int count;

}