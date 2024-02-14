package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.UserEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface UserRepository extends CrudRepository<UserEntity, UUID> {
}