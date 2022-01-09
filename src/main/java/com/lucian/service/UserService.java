package com.lucian.service;

import com.lucian.dao.UserDao;
import com.lucian.model.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Optional<DAOUser> getUserDetails(Long id) {
        return userDao.findById(id);
    }
}
