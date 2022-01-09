package com.lucian.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lucian.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Long> {
	
	DAOUser findByEmail(String email);
	
}