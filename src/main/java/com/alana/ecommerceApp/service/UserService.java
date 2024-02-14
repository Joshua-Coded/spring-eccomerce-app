package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.AddressEntity;
import com.alana.ecommerceApp.entity.CardEntity;
import com.alana.ecommerceApp.entity.UserEntity;
import java.util.Optional;

/**
 * @author : Joshua Alana
 **/
public interface UserService {
    public void deleteCustomerById(String id);
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);
    public Iterable<UserEntity> getAllCustomers();
    public Optional<CardEntity> getCardByCustomerId(String id);
    public Optional<UserEntity> getCustomerById(String id);
}