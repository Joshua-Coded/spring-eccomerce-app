package com.alana.modern.api.repository;

import com.alana.modern.api.entity.CardEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : Joshua Alana
 **/
public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}