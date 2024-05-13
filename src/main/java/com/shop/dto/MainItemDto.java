package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainItemDto {

    private Long id;

    private String itemName;

    private String itemDetail;

    private Integer price;

    @QueryProjection  // for direct projection at querydsl
    public MainItemDto(Long id, String itemName, String itemDetail,Integer price){
        this.id = id;
        this.itemName = itemName;
        this.itemDetail = itemDetail;
        this.price = price;
    }

}