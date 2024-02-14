package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.ProductEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}