package com.example.ticket.repository;

import com.example.ticket.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,String>{
    User findBynic(String nic);
}
