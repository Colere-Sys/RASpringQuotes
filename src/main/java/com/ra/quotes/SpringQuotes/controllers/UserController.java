package com.ra.quotes.SpringQuotes.controllers;


import com.ra.quotes.SpringQuotes.datamodel.UserTO;
import com.ra.quotes.SpringQuotes.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping("/users")
    List<UserTO> getAllUsers() {
        return userService.getAllUsers();
    }

}
