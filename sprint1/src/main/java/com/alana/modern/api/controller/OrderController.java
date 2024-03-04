package com.alana.modern.api.controller;

import com.alana.modern.api.PaymentApi;
import com.alana.modern.api.hateoas.PaymentRepresentationModelAssembler;
import com.alana.modern.api.model.Authorization;
import com.alana.modern.api.model.PaymentReq;
import com.alana.modern.api.service.PaymentService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Joshua Alana
 */

@RestController
public class OrderController implements OrderApi {

    private final OrderRepresentationModelAssembler assembler;
    private OrderService service;

    public OrderController(OrderService service, OrderRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Order> addOrder(@Valid NewOrder newOrder) {
        return service.addOrder(newOrder).map(assembler::toModel).map(ResponseEntity::ok)
                .orElse(notFound().build());
    }

    @Override
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@NotNull @Valid String customerId) {
        return ok(assembler.toListModel(service.getOrdersByCustomerId(customerId)));
    }

    @Override
    public ResponseEntity<Order> getByOrderId(String id) {
        return service.getByOrderId(id).map(assembler::toModel).map(ResponseEntity::ok)
                .orElse(notFound().build());
    }
}