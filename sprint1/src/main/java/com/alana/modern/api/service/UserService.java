package com.alana.modern.api.service;

import com.alana.modern.api.entity.AddressEntity;
import com.alana.modern.api.entity.CardEntity;
import com.alana.modern.api.entity.UserEntity;
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