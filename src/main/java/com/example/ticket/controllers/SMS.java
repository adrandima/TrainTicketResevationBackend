package com.example.ticket.controllers;

import com.example.ticket.Config;
import com.example.ticket.model.Card;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("sms")
@CrossOrigin(origins = Config.a_Origin)
public class SMS{
    private final static String ACCOUNT_SID = "ACd8f1640006e766095a43ca1e6f4312b8";
    private final static String AUTH_ID = "b2572f7f6f6a9987fb08ec0d413a8176";
    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }


    @RequestMapping(value = "/{smsNumber}", method = RequestMethod.GET)
    public String sendSms(@PathVariable("smsNumber") String smsNumber) throws Exception {
        String pinNumber = genarateRandomNumber();
        Message.creator(new PhoneNumber(smsNumber), new PhoneNumber("+12242078592"),
                "Your Verification Code is: "+pinNumber).create();
        return pinNumber;
    }


    private String genarateRandomNumber(){
        int randomPIN = (int)(Math.random()*9000)+1000;
        String pin = String.valueOf(randomPIN);
        return pin;
    }
}
