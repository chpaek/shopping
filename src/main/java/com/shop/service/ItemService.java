package com.shop.service;

import com.shop.dto.ItemFormDto;
import com.shop.entity.Item;
import com.shop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import jakarta.persistence.EntityNotFoundException;

import com.shop.dto.ItemSearchDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.shop.dto.MainItemDto;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;


    public Long saveItem(ItemFormDto itemFormDto) throws Exception{

        Item item = itemFormDto.createItem();
        itemRepository.save(item);
        return item.getId();
    }

    @Transactional(readOnly = true)
    public ItemFormDto getItemDtl(Long itemId){
        Item item = itemRepository.findById(itemId)
                .orElseThrow(EntityNotFoundException::new);
        ItemFormDto itemFormDto = ItemFormDto.of(item);
        return itemFormDto;
    }

    public Long updateItem(ItemFormDto itemFormDto) throws Exception{

        Item item = itemRepository.findById(itemFormDto.getId())
                .orElseThrow(EntityNotFoundException::new);
        item.updateItem(itemFormDto);

        return item.getId();
    }

    @Transactional(readOnly = true)
    public List<Item> getAdminItemPage(ItemSearchDto itemSearchDto){
        return itemRepository.getAdminItemPage(itemSearchDto);
    }

    @Transactional(readOnly = true)
    public List<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto){
        return itemRepository.getMainItemPage(itemSearchDto);
    }

}