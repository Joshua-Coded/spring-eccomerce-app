package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.ShipmentEntity;
import javax.validation.constraints.Min;

/**
 * @author : Joshua Alana
 **/
public interface ShipmentService {
    public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}