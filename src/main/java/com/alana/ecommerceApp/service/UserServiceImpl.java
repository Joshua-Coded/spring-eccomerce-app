package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.AddressEntity;
import com.alana.ecommerceApp.entity.CardEntity;
import com.alana.ecommerceApp.entity.UserEntity;
import com.alana.ecommerceApp.repository.UserRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * @author : Joshua Alana
 **/
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteCustomerById(String id) {
        repository.deleteById(UUID.fromString(id));
    }

    @Override
    public Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id) {
        return repository.findById(UUID.fromString(id)).map(UserEntity::getAddresses);
    }

    @Override
    public Iterable<UserEntity> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Optional<CardEntity> getCardByCustomerId(String id) {
        return Optional.of(repository.findById(UUID.fromString(id)).map(UserEntity::getCard).get().get(0));
    }

    @Override
    public Optional<UserEntity> getCustomerById(String id) {
        return repository.findById(UUID.fromString(id));
    }
}