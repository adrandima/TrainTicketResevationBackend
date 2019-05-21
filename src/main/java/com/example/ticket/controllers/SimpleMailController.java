package com.example.ticket.controllers;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import com.example.ticket.Config;
import com.example.ticket.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("mail")
@CrossOrigin(origins = Config.a_Origin)
public class SimpleMailController {
    @Autowired
    private JavaMailSender sender;


    @RequestMapping(value = "/{email}", method = RequestMethod.GET)
    public String sendMail(@PathVariable("email") String email) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        String pinNumber = genarateRandomNumber();
        try {
            helper.setTo(email);
            helper.setText("Pin Number:)");
            helper.setSubject("Your Pin Number Is: "+pinNumber);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);

        return pinNumber;
    }

    private String genarateRandomNumber(){
        int randomPIN = (int)(Math.random()*9000)+1000;
        String pin = String.valueOf(randomPIN);
        return pin;
    }
}
