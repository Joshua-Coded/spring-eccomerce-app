package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.ShipmentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}