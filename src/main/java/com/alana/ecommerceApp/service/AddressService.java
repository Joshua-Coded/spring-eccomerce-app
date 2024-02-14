package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.AddressEntity;
import com.alana.ecommerceApp.model.AddAddressReq;
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