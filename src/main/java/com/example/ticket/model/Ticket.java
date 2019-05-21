package com.example.ticket.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;

public class Ticket {
    @Id
    private ObjectId _id;

    private String nic;

    private String name;

    private String train;

    private int noOfTickets;

    private String classType;

    private String start;

    private String destination;

    private double cost;

    public Ticket(ObjectId _id, String nic, String name, String train, int noOfTickets, String classType, String start, String destination, double cost) {
        this._id = _id;
        this.nic = nic;
        this.name = name;
        this.train = train;
        this.noOfTickets = noOfTickets;
        this.classType = classType;
        this.start = start;
        this.destination = destination;
        this.cost = cost;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
