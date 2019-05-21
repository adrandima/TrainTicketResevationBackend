package com.example.ticket.controllers;

import com.example.ticket.Config;
import com.example.ticket.model.Ticket;
import com.example.ticket.repository.TicketRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("ticket")
@CrossOrigin(origins = Config.a_Origin)
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Ticket> getAllTicket() {

        return ticketRepository.findAll();
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.GET)
    public Ticket getTicketById(@PathVariable("_id") ObjectId ticketId) {

        return ticketRepository.findBy_id(ticketId);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Ticket createTicket(@Valid @RequestBody Ticket ticket) {
        ticket.set_id(ObjectId.get());
        ticketRepository.save(ticket);
        System.out.println("POST TEST IN SPRING BOOT"+ticket.toString());

        return ticket;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.PUT)
    public void modifyTicketById(@PathVariable("_id") ObjectId _id, @Valid @RequestBody Ticket ticket) {
        ticket.set_id(_id);
        ticketRepository.save(ticket);
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteTicket(@PathVariable ObjectId _id) {

        ticketRepository.delete(ticketRepository.findBy_id(_id));
    }
}
