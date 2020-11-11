package com.sprinttwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprinttwo.dto.Admin;
import com.sprinttwo.service.AdminService;



@Controller
@RequestMapping("/Admin")
public class AdminController implements IAdminController{
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/{id}")
	public @ResponseBody Admin getAdminById(@PathVariable Integer id)
	{
		return adminService.getAdminById(id);
		
	}
	@PostMapping("/")
	public @ResponseBody Admin insertAdmin(@RequestBody Admin admin)
	{
		return adminService.insertAdmin(admin);
	}
	@PutMapping("/")
	public @ResponseBody Admin updateAdmin(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
		
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody boolean deleteAdmin(@PathVariable Integer id)
	{
		return adminService.deleteAdminbyId(id);
	}
	
	@GetMapping("/")
	public @ResponseBody List<Admin> getAllAdmin()
	{
		List<Admin> adminlist=adminService.getAllAdmins();
		return adminlist;
	}
	
	
	
	
	
	
}
