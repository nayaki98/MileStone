package com.example.stockspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

	/*int loginUser(User user);*/

}
