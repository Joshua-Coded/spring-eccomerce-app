package com.alana.modern.api.repository;

import com.alana.modern.api.entity.UserEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface UserRepository extends CrudRepository<UserEntity, UUID> {
}