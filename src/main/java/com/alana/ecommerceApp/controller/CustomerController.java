package com.alana.ecommerceApp.controller;

import static org.springframework.http.ResponseEntity.accepted;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

import com.alana.ecommerceApp.CustomerApi;
import com.alana.ecommerceApp.hateoas.AddressRepresentationModelAssembler;
import com.alana.ecommerceApp.hateoas.CardRepresentationModelAssembler;
import com.alana.ecommerceApp.hateoas.UserRepresentationModelAssembler;
import com.alana.ecommerceApp.model.Address;
import com.alana.ecommerceApp.model.Card;
import com.alana.ecommerceApp.model.User;
import com.alana.ecommerceApp.service.UserService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @athor Joshua Alana
 */
@RestController
public class CustomerController implements CustomerApi {

    private final UserRepresentationModelAssembler assembler;
    private final AddressRepresentationModelAssembler addrAssembler;
    private final CardRepresentationModelAssembler cardAssembler;
    private UserService service;

    public CustomerController(UserService service, UserRepresentationModelAssembler assembler,
                              AddressRepresentationModelAssembler addrAssembler,
                              CardRepresentationModelAssembler cardAssembler) {
        this.service = service;
        this.assembler = assembler;
        this.addrAssembler = addrAssembler;
        this.cardAssembler = cardAssembler;
    }

    @Override
    public ResponseEntity<Void> deleteCustomerById(String id) {
        service.deleteCustomerById(id);
        return accepted().build();
    }

    @Override
    public ResponseEntity<List<Address>> getAddressesByCustomerId(String id) {
        return service.getAddressesByCustomerId(id).map(addrAssembler::toListModel)
                .map(ResponseEntity::ok).orElse(notFound().build());
    }

    @Override
    public ResponseEntity<List<User>> getAllCustomers() {
        return ok(assembler.toListModel(service.getAllCustomers()));
    }

    @Override
    public ResponseEntity<Card> getCardByCustomerId(String id) {
        return service.getCardByCustomerId(id).map(cardAssembler::toModel).map(ResponseEntity::ok)
                .orElse(notFound().build());
    }

    @Override
    public ResponseEntity<User> getCustomerById(String id) {
        return service.getCustomerById(id).map(assembler::toModel).map(ResponseEntity::ok)
                .orElse(notFound().build());
    }
}