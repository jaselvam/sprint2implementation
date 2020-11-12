package com.sprinttwo.service;

import com.sprinttwo.dto.User;

public interface IUserService {            // By default all the methods present in a interface are public abstract.
	public String login(User user);
	
	public User insertUser(User user);
	
	public boolean deleteAdminbyName(String userName);
	
	public String logout(User user);

}
