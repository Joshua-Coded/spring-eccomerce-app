package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.OrderEntity;
import com.alana.ecommerceApp.model.NewOrder;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author : Joshua Alana
 **/
public interface OrderService {

    public Optional<OrderEntity> addOrder(@Valid NewOrder newOrder);
    public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId);
    public Optional<OrderEntity> getByOrderId(String id);
}