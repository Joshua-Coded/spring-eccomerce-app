package com.alana.modern.api.service;

import com.alana.modern.api.entity.AddressEntity;
import com.alana.modern.api.model.AddAddressReq;
import java.util.Optional;

/**
 * @author : Joshua Alana
 **/
public interface AddressService {
    public Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);
    public void deleteAddressesById(String id);
    public Optional<AddressEntity> getAddressesById(String id);
    public Iterable<AddressEntity> getAllAddresses();
}