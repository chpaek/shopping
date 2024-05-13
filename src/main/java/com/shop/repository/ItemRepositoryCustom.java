package com.shop.repository;

import com.shop.dto.ItemSearchDto;
import com.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.shop.dto.MainItemDto;

import java.util.List;

public interface ItemRepositoryCustom {

    List<Item> getAdminItemPage(ItemSearchDto itemSearchDto);

    List<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto);

}