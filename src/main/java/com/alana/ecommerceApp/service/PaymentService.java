package com.alana.ecommerceApp.service;

import com.alana.ecommerceApp.entity.AuthorizationEntity;
import com.alana.ecommerceApp.model.PaymentReq;
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