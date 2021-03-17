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

        //find all fait parti de la class JpaRepository, les operations CRUD (create, read, update, delete) on a pas besoin de les programmer
        // ils sont fourni par spring si on veut des operations speciaux on peut ecrire nos requete nos meme @Query.
        return userDAO.findAll();
    }

}
