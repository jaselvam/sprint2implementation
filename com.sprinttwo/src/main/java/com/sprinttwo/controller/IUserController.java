package com.sprinttwo.controller;


import com.sprinttwo.dto.User;

public interface IUserController {
	public String login(User user);
	
	public User insertUser(User user);
	
	public boolean deleteUser(String userName);
	
	public String logout(User user);

}
