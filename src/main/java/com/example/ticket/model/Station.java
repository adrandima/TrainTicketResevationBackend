package com.example.ticket.model;

import javax.validation.constraints.NotEmpty;

public class Station {
    @NotEmpty
    private String station;
    @NotEmpty
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
