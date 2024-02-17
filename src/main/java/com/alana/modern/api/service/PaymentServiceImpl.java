package com.alana.modern.api.service;

import com.alana.modern.api.entity.AuthorizationEntity;
import com.alana.modern.api.model.PaymentReq;
import com.alana.modern.api.repository.OrderRepository;
import com.alana.modern.api.repository.PaymentRepository;
import java.util.Optional;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

/**
 * @author : Joshua Alana
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository repository;
    private OrderRepository orderRepo;

    public PaymentServiceImpl(PaymentRepository repository, OrderRepository orderRepo) {
        this.repository = repository;
        this.orderRepo = orderRepo;
    }

    @Override
    public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq) {
        return Optional.empty();
    }

    @Override
    public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId) {
        return orderRepo.findById(UUID.fromString(orderId)).map(oe -> oe.getAuthorizationEntity());
    }

  /*private AuthorizationEntity toEntity(PaymentReq m) {
    PaymentEntity e = new PaymentEntity();
    e.setAuthorized(true).setMessage()
  }*/
}