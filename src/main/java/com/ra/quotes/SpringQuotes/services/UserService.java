package com.ra.quotes.SpringQuotes.services;

import com.ra.quotes.SpringQuotes.datamodel.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.List;

// ALL methods needed by us to return the user-specific services.

@Service
public class UserService {

    /**
     * should return all users in db
      * @return
     */
    public List<User> getAllUsers() {

        return null;
    }

}
