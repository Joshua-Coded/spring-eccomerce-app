package com.alana.modern.api.controller;

import static org.springframework.http.ResponseEntity.accepted;
import static org.springframework.http.ResponseEntity.ok;

import com.alana.modern.api.CartApi;
import com.alana.modern.api.model.Cart;
import com.alana.modern.api.model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Joshua Alana
 */

@RestController
public class CartsController implements CartApi {

  private static final Logger log = LoggerFactory.getLogger(CartsController.class);

  @Override
  public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
    log.info("Request for customer ID: {}\nItem: {}", customerId, item);
    return ok(Collections.EMPTY_LIST);
  }

  @Override
  public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId,
      @Valid Item item) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteCart(String customerId) {
    return null;
  }

  @Override
  public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
    throw new RuntimeException("Manual Exception thrown");
  }

  @Override
  public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
    return null;
  }
}
