package com.alana.modern.api.service;

import com.alana.modern.api.entity.AuthorizationEntity;
import com.alana.modern.api.model.PaymentReq;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author : Joshua Alana
 **/
public interface PaymentService {

    public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
    public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}