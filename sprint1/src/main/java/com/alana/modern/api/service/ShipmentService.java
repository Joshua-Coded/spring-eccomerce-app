package com.alana.modern.api.service;

import com.alana.modern.api.entity.ShipmentEntity;
import javax.validation.constraints.Min;

/**
 * @author : Joshua Alana
 **/
public interface ShipmentService {
    public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}