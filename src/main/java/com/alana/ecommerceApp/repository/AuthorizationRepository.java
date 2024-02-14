package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.AuthorizationEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}