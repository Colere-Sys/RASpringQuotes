package com.ra.quotes.SpringQuotes.controllers;


import com.ra.quotes.SpringQuotes.datamodel.About;
import com.ra.quotes.SpringQuotes.datamodel.AboutInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @Autowired
    private About aboutApp;

    @GetMapping("/about")
    public AboutInfos getAbout() {
        return aboutApp.toAboutInfos();
    }
}
