package com.example.ticket.model;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;

public class Card {
    @Id
    private String cardNumber;
    @NotEmpty
    private String name;
    @NotEmpty
    private String nic;
    @NotEmpty
    private String expireMonth;
    @NotEmpty
    private String expireYear;
    @NotEmpty
    private int cvcCode;

    private double amount;

    public Card(String cardNumber, String name, String nic, String expireMonth, String expireYear, int cvcCode, double amount) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.nic = nic;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.cvcCode = cvcCode;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public int getCvcCode() {
        return cvcCode;
    }

    public void setCvcCode(int cvcCode) {
        this.cvcCode = cvcCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
