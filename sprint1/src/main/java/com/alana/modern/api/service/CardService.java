package com.alana.modern.api.service;

import com.alana.modern.api.entity.CardEntity;
import com.alana.modern.api.model.AddCardReq;
import java.util.Optional;
import javax.validation.Valid;

/**
 * @author : Joshua Alana
 **/
public interface CardService {
    public void deleteCardById(String id);
    public Iterable<CardEntity> getAllCards();
    public Optional<CardEntity> getCardById(String id);
    public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}