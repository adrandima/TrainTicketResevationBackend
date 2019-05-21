package com.example.ticket.controllers;


import com.example.ticket.Config;
import com.example.ticket.Validations;
import com.example.ticket.model.Card;
import com.example.ticket.model.Ticket;
import com.example.ticket.repository.CardRepository;
import com.example.ticket.repository.TicketRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("card")
@CrossOrigin(origins = Config.a_Origin)
public class CardController {

    @Autowired
    private CardRepository cardRepository;
    Validations validate;

    @RequestMapping(value = "/{cardNumber}", method = RequestMethod.GET)
    public Card getCardById(@PathVariable("cardNumber") String _id) {

        return cardRepository.findBycardNumber(_id);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Card createCard(@Valid @RequestBody Card card) {
        System.out.println(card.getNic());
        cardRepository.save(card);
        System.out.println("POST TEST IN SPRING BOOT"+card.toString());
        return card;
    }



}
