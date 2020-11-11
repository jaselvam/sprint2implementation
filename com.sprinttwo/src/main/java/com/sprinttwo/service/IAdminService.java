package com.sprinttwo.service;

import java.util.List;

import com.sprinttwo.dto.Admin;

public interface IAdminService {
	public Admin getAdminById(Integer id);
	
	public Admin insertAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin);
	
	public boolean deleteAdminbyId(Integer id);
	
	public List<Admin> getAllAdmins();

}
