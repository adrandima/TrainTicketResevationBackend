package com.example.ticket.repository;

import com.example.ticket.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card,String> {
    Card findBycardNumber(String cardNumber);

}
