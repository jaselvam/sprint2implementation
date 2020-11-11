package com.sprinttwo.controller;


import java.util.List;


import com.sprinttwo.dto.Admin;

public interface IAdminController {
	public Admin getAdminById(Integer id);
	
	public Admin insertAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin);
	
	public boolean deleteAdmin(Integer id);
	
	public List<Admin> getAllAdmin();
	
}
