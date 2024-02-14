package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.OrderEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author : Joshua Alana
 **/
@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, UUID>, OrderRepositoryExt {

    @Query("select o from OrderEntity o join o.userEntity u where u.id = :customerId")
    public Iterable<OrderEntity> findByCustomerId(@Param("customerId") UUID customerId);
}