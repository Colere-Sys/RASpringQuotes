package com.ra.quotes.SpringQuotes.controllers;

import com.ra.quotes.SpringQuotes.datamodel.Quote;
import com.ra.quotes.SpringQuotes.services.QuoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class QuoteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Autowired
    private QuoteService quoteService;

    @PostMapping("/quote/create")
    public void createQuote(@RequestBody Quote quoteToCreate) {
        quoteService.validate(quoteToCreate);

    }
}
