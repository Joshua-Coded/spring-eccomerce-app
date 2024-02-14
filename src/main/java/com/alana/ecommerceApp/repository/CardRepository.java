package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.CardEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}