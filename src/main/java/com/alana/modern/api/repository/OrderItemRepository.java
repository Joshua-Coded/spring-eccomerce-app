package com.alana.modern.api.repository;

import com.alana.modern.api.entity.OrderItemEntity;
import com.alana.modern.api.entity.TagEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


/**
 * @author : Joshua Alana
 **/
public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}