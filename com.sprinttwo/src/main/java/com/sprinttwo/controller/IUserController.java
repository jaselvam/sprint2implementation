package com.sprinttwo.controller;


import com.sprinttwo.dto.User;

public interface IUserController {       // By default all the methods present in a interface are public abstract.
	public String login(User user);
	
	public User insertUser(User user);
	
	public boolean deleteUser(String userName);
	
	public String logout(User user);

}
