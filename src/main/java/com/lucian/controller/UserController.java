package com.lucian.controller;

import com.lucian.model.DAOUser;
import com.lucian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user-details/{id}")
    public DAOUser getUserDetails(@PathVariable Long id) {
        final Optional<DAOUser> userDetails = userService.getUserDetails(id);
        if (userDetails.isPresent()) {
            return userDetails.get();
        } else {
            throw new UsernameNotFoundException("Username id not found");
        }


    }

}