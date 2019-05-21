package com.example.ticket.model;

public class Station {
    private String station;
    private double price;

    public Station(String station, double price) {
        this.station = station;
        this.price = price;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
