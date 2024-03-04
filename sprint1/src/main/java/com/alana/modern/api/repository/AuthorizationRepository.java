package com.alana.modern.api.repository;

import com.alana.modern.api.entity.AuthorizationEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}