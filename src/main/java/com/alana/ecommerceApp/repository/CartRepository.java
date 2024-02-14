package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.CartEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author : Joshua Alana
 **/
public interface CartRepository extends CrudRepository<CartEntity, UUID> {
    @Query("select c from CartEntity c join c.user u where u.id = :customerId")
    public Optional<CartEntity> findByCustomerId(@Param("customerId") UUID customerId);
}