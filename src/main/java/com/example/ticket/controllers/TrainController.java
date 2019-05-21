package com.example.ticket.controllers;


import com.example.ticket.Config;
import com.example.ticket.model.Ticket;
import com.example.ticket.model.Train;
import com.example.ticket.model.User;
import com.example.ticket.repository.TrainRepository;
import com.example.ticket.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("train")
@CrossOrigin(origins = Config.a_Origin)
public class TrainController {



    @Autowired
    private TrainRepository repository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Train> getAllTrains() {

        return repository.findAll();
    }


    @RequestMapping(value = "/{_id}", method = RequestMethod.PUT)
    public Train modifyTrain(@PathVariable("_id") String trainNo, @Valid @RequestBody Train train) {
        Train train1 = repository.findById(trainNo).orElseThrow(() -> new ResourceNotFoundException());

        train1.setTrainName(train.getTrainName());
        train1.setSeats(train.getSeats());
        train1.setStart(train.getStart());
        train1.setDestination(train.getDestination());
        train1.setTrainDate(train.getTrainDate());
        train1.setStartTime(train.getStartTime());
        train1.setStopStations(train.getStopStations());

        return repository.save(train1);


    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Train createTrain(@Valid @RequestBody Train tr) {

        repository.save(tr);
        return tr;
    }

    private class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException() {
        }
    }
}
