package com.example.ticket.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.List;

public class Train {
/*    @Id
    @GeneratedValue
    private String _id;*/
    @Id
    private String trainNo;
    private String trainName;
    private int seats;
    private String start;
    private String destination;
    private String trainDate;
    private String startTime;
    private List<Station> stopStations;

    public Train(String trainNo, String trainName, int seats, String start, String destination, String trainDate, String startTime, List<Station> stopStations) {

        this.trainNo = trainNo;
        this.trainName = trainName;
        this.seats = seats;
        this.start = start;
        this.destination = destination;
        this.trainDate = trainDate;
        this.startTime = startTime;
        this.stopStations = stopStations;
    }



    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
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

    public String getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<Station> getStopStations() {
        return stopStations;
    }

    public void setStopStations(List<Station> stopStations) {
        this.stopStations = stopStations;
    }
}
