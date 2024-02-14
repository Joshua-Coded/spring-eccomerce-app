package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.AddressEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}