package com.example.ticket.repository;

import com.example.ticket.model.Train;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainRepository extends MongoRepository<Train,String> {
    Train findBytrainNo(String trainNo);
}
