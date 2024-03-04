package com.alana.modern.api.repository;

import com.alana.modern.api.entity.OrderEntity;
import com.alana.modern.api.model.NewOrder;
import java.util.Optional;

/**
 * @author : Joshua Alana
 **/
public interface OrderRepositoryExt {
    Optional<OrderEntity> insert(NewOrder m);
}