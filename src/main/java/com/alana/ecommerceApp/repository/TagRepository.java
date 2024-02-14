package com.alana.ecommerceApp.repository;

import com.alana.ecommerceApp.entity.TagEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


/**
 * @author : Joshua Alana
 **/
public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}