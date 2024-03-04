package com.alana.modern.api.service;

import com.alana.modern.api.entity.CartEntity;
import com.alana.modern.api.model.Item;
import java.util.List;
import javax.validation.Valid;

/**
 * @author : Joshua Alana
 **/
public interface CartService {

    public List<Item> addCartItemsByCustomerId(String customerId, @Valid Item item);

    public List<Item> addOrReplaceItemsByCustomerId(String customerId, @Valid Item item);

    public void deleteCart(String customerId);

    public void deleteItemFromCart(String customerId, String itemId);

    public CartEntity getCartByCustomerId(String customerId);

    public List<Item> getCartItemsByCustomerId(String customerId);

    public Item getCartItemsByItemId(String customerId, String itemId);
}