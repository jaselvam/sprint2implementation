package com.sprinttwo.service;

import com.sprinttwo.dto.User;

public interface IUserService {
	public String login(User user);
	
	public User insertUser(User user);
	
	public boolean deleteAdminbyName(String userName);
	
	public String logout(User user);

}
