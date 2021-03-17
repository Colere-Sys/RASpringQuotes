package com.ra.quotes.SpringQuotes.dao;

import com.ra.quotes.SpringQuotes.datamodel.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteDAO extends JpaRepository<Quote, Long> {
}
