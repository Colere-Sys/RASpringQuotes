package com.ra.quotes.SpringQuotes.dao;

import com.ra.quotes.SpringQuotes.datamodel.UserTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<UserTO, Long> {
}
