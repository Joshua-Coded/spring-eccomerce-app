package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.OrderEntity;
import com.alana.ecommerceApp.model.NewOrder;
import java.util.Optional;

/**
 * @author : Joshua Alana
 **/
public interface OrderRepositoryExt {
    Optional<OrderEntity> insert(NewOrder m);
}