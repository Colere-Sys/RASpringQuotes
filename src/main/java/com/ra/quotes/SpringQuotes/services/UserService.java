package com.ra.quotes.SpringQuotes.services;

import com.ra.quotes.SpringQuotes.dao.UserDAO;
import com.ra.quotes.SpringQuotes.datamodel.UserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// ALL methods needed by us to return the user-specific services.

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;
    /**
     * should return all users in db
      * @return
     */
    public List<UserTO> getAllUsers() {
        return userDAO.findAll();
    }

    public UserTO createUser(UserTO userToCreate) {
        //this method will create the user and return the same user to us.
        UserTO createdUser = userDAO.save(userToCreate);
        return createdUser;
    }

}
