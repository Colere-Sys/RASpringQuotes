package com.ra.quotes.SpringQuotes.services;

import com.ra.quotes.SpringQuotes.Exception.SpringQuotesException;
import com.ra.quotes.SpringQuotes.dao.QuoteDAO;
import com.ra.quotes.SpringQuotes.datamodel.Quote;
import com.ra.quotes.SpringQuotes.datamodel.UserTO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.lang.invoke.MethodHandles;
import java.util.List;

@Service
public class QuoteService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Autowired
    private QuoteDAO quoteDAO;

    // validate if the quote is well received
    public void validate(Quote quoteToValidate) {
        if (quoteToValidate == null) {
            throw new SpringQuotesException("Quote is null");
        }
        if (StringUtils.isBlank(quoteToValidate.getSource())) {
            throw new SpringQuotesException("Quote can't be without source !!");
        }
    }

    /**
     * should return all quotes in db
     * @return
     */
    public List<Quote> getAllQuotes() {
        return quoteDAO.findAll();
    }

    public Quote createQuote(Quote quoteToCreate) {
        //this method will create the quote and return the same quote to us.
        Quote createQuote = quoteDAO.save(quoteToCreate);
        return createQuote;
    }
}
