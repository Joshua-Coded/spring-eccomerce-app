package com.alana.modern.api.repository;

import com.alana.modern.api.entity.ProductEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}