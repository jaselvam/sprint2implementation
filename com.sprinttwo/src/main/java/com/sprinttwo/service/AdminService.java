package com.sprinttwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprinttwo.dto.Admin;
import com.sprinttwo.exception.InvalidOperation;
import com.sprinttwo.repository.AdminRepository;
import com.sprinttwo.utility.ValidateAdmin;


@Service
public class AdminService implements IAdminService{
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin getAdminById(Integer id) {
		try {
			return adminRepository.findById(id).get();
		}
		catch(InvalidOperation ie)
		{
			ie.printStackTrace();
			return null;
		}
	}
	public Admin insertAdmin(Admin admin) {
		try
		{
			return adminRepository.save(admin);
		}
		catch(InvalidOperation ie){
			
			throw new InvalidOperation("Admin not inserted");
		}
	
	}
	public Admin updateAdmin(Admin admin) {
		try
		{
			adminRepository.save(admin);
			return admin;
		}
		catch(InvalidOperation ie)
		{
			throw new InvalidOperation("Admin not updated");
			
		}
	}
	public boolean deleteAdminbyId(Integer id) {
		try {
			adminRepository.deleteById(id);
			return true;
		}
		catch(InvalidOperation ie)
		{
			throw new InvalidOperation("Admin not deleted");
		}
	
	}
	public List<Admin> getAllAdmins() {
		List<Admin> adminlist=new ArrayList<>();
		adminRepository.findAll().forEach(admin->adminlist.add(admin));
		return adminlist;
	}
	
}
