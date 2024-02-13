package com.alana.ecommerceApp.controller;

import static org.springframework.http.ResponseEntity.ok;

import import com.alana.ecommerceApp.ProductApi;
import import com.alana.ecommerceApp.model.Product;
import import com.alana.ecommerceApp.hateoas.ProductRepresentationModelAssembler;
import import com.alana.ecommerceApp.service.ProductService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Joshua Alana
 **/
@RestController
public class ProductController implements ProductApi {

    private ProductService service;
    private final ProductRepresentationModelAssembler assembler;

    public ProductController(ProductService service, ProductRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Product> getProduct(String id) {
        return service.getProduct(id).map(assembler::toModel).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Product>> queryProducts(@Valid String tag, @Valid String name,
                                                       @Valid Integer page, @Valid Integer size) {
        return ok(assembler.toListModel(service.getAllProducts()));
    }
}