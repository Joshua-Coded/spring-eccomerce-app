package com.alana.ecommerceApp.controller;

import com.alana.ecommerceApp.PaymentApi;
import com.alana.ecommerceApp.hateoas.PaymentRepresentationModelAssembler;
import com.alana.ecommerceApp.model.Authorization;
import com.alana.ecommerceApp.model.PaymentReq;
import com.alana.ecommerceApp.service.PaymentService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joshua Alana
 */

@RestController
public class PaymentController implements PaymentApi {

    private PaymentService service;
    private final PaymentRepresentationModelAssembler assembler;

    public PaymentController(PaymentService service, PaymentRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Authorization> authorize(@Valid PaymentReq paymentReq) {
        return null;
    }

    @Override
    public ResponseEntity<Authorization> getOrdersPaymentAuthorization(
            @NotNull @Valid String id) {
        return null;
    }
}