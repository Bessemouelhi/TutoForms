package com.bessem.dao;

import java.util.List;

import com.bessem.beans.User;

public interface UserDao {
	
	void add(User user);
	
	List<User> getAllUser();

}
