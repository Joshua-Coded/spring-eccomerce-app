package com.alana.modern.api.service;

import com.alana.modern.api.entity.ProductEntity;
import java.util.Optional;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * @author : Joshua Alana
 **/
@Validated
public interface ProductService {
    @NotNull Iterable<ProductEntity> getAllProducts();
    Optional<ProductEntity> getProduct(@Min(value = 1L, message = "Invalid product ID.") String id);
}