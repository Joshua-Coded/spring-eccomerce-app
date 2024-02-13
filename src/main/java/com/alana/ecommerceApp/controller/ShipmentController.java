package com.alana.ecommerceApp.controller;

import  com.alana.ecommerceApp.ShipmentApi;
import com.alana.ecommerceApp.hateoas.ShipmentRepresentationModelAssembler;
import com.alana.ecommerceApp.model.Shipment;
import com.alana.ecommerceApp.service.ShipmentService;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Joshua Alana
 **/
@RestController
public class ShipmentController implements ShipmentApi {

    private ShipmentService service;
    private final ShipmentRepresentationModelAssembler assembler;

    public ShipmentController(ShipmentService service, ShipmentRepresentationModelAssembler assembler) {
        this.service = service;
        this.assembler = assembler;
    }

    @Override
    public ResponseEntity<List<Shipment>> getShipmentByOrderId(@NotNull @Valid String id) {
        return ResponseEntity.ok(assembler.toListModel(service.getShipmentByOrderId(id)));
    }
}