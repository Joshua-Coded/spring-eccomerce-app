package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.ItemEntity;
import com.alana.ecommerceApp.model.Item;
import java.util.List;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot
 **/
public interface ItemService {

    ItemEntity toEntity(Item m);

    List<ItemEntity> toEntityList(List<Item> items);

    Item toModel(ItemEntity e);

    List<Item> toModelList(List<ItemEntity> items);
}