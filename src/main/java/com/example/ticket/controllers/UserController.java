package com.example.ticket.controllers;

import com.example.ticket.Config;
import com.example.ticket.model.User;
import com.example.ticket.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("user")
@CrossOrigin(origins = Config.a_Origin)
public class UserController {


    @Autowired
    private UserRepository repository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return repository.findAll();
    }

    @RequestMapping(value = "/{nic}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("nic") String nic) {

        return repository.findBynic(nic);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User createUser(@Valid @RequestBody User us) {
        repository.save(us);
        return us;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody User us) {

        repository.save(us);
    }

    @RequestMapping(value = "/{nic}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String nic) {

        repository.delete(repository.findBynic(nic));
    }
}
