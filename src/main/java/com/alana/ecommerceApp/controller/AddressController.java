package com.alana.ecommerceApp.controller;

import static org.springframework.http.ResponseEntity.accepted;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

import com.alana.ecommerceApp.AddressApi;
import com.alana.ecommerceApp.hateoas.AddressRepresentationModelAssembler;
import com.alana.ecommerceApp.models.AddAddressReq;
import com.alana.ecommerceApp.models.Address;
import com.alana.ecommerceApp.service.AddressService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Joshua Alana
 */

@RestController
public class AddressController implements AddressApi {

    private AddressService service;
    private final AddressRepresentationModelAssembler assembler;

    public AddressController(AddressService addressService, AddressRepresentationModelAssembler assembler) {
        this.service = addressService;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<Address> createAddress(@Valid AddAddressReq addAddressReq) {
        return status(HttpStatus.CREATED).body(service.createAddress(addAddressReq)
                .map(assembler::toModel).get());
    }

    @Override
    public ResponseEntity<Void> deleteAddressesById(String id) {
        service.deleteAddressesById(id);
        return accepted().build();
    }

    @Override
    public ResponseEntity<Address> getAddressesById(String id) {
        return service.getAddressesById(id).map(assembler::toModel)
                .map(ResponseEntity::ok).orElse(notFound().build());
    }

    @Override
    public ResponseEntity<List<Address>> getAllAddresses() {
        return ok(assembler.toListModel(service.getAllAddresses()));
    }
}