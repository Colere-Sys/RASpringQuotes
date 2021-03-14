package com.ra.quotes.SpringQuotes.services;

import com.ra.quotes.SpringQuotes.Exception.SpringQuotesException;
import com.ra.quotes.SpringQuotes.datamodel.Quote;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.lang.invoke.MethodHandles;

@Service
public class QuoteService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void validate(Quote quoteToValidate) {
        if (quoteToValidate == null) {
            throw new SpringQuotesException("Quote is null");
        }
        if (StringUtils.isBlank(quoteToValidate.getSource())) {
            throw new SpringQuotesException("Quote can't be without source !!");
        }

    }

}
