package com.adrian.controller;

import com.adrian.model.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by adri4n on 20.09.2016.
 */
@RestController
@RequestMapping("/")
public class MainController {

    final static Logger LOG = Logger.getLogger(MainController.class);

    @RequestMapping(value="/main/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getAUser() {
        LOG.info("ce");
        User user = new User(10, "popa","asd");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value="/mainPage", method = RequestMethod.GET)
    public String getMainPage() {
        return "indexa";
    }
}
