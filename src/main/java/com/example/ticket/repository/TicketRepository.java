package com.example.ticket.repository;

import com.example.ticket.model.Ticket;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket,String> {
    Ticket findBy_id(ObjectId _id);
}
