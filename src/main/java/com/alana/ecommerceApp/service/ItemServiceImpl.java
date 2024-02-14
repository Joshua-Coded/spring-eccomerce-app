package com.alana.ecommerceApp.service;

import static java.util.stream.Collectors.toList;

import com.alana.ecommerceApp.entity.ItemEntity;
import com.alana.ecommerceApp.entity.ProductEntity;
import com.alana.ecommerceApp.model.Item;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * @author : Joshua Alana
 **/
@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemEntity toEntity(Item m) {
        ItemEntity e = new ItemEntity();
        e.setProduct(new ProductEntity().setId(UUID.fromString(m.getId()))).setPrice(m.getUnitPrice())
                .setQuantity(m.getQuantity());
        return e;
    }

    @Override
    public List<ItemEntity> toEntityList(List<Item> items) {
        if (Objects.isNull(items)) {
            return Collections.emptyList();
        }
        return items.stream().map(m -> toEntity(m)).collect(toList());
    }

    @Override
    public Item toModel(ItemEntity e) {
        Item m = new Item();
        m.id(e.getProduct().getId().toString()).unitPrice(e.getPrice()).quantity(e.getQuantity());
        return m;
    }

    @Override
    public List<Item> toModelList(List<ItemEntity> items) {
        if (Objects.isNull(items)) {
            return Collections.emptyList();
        }
        return items.stream().map(e -> toModel(e)).collect(toList());
    }
}