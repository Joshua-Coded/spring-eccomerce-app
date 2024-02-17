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

import java.util.List;

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
    public ResponseEntity<List<Authorization>> getOrdersPaymentAuthorization(
            @NotNull @Valid String id) {
        return null;
    }
}