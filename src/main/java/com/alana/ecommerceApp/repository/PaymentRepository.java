package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.PaymentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}