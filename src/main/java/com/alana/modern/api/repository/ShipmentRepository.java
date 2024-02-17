package com.alana.modern.api.repository;

import com.alana.modern.api.entity.ShipmentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}