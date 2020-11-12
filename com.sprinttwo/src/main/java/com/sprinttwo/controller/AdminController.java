package com.sprinttwo.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@RequestMapping("/Admin")              //Maps a specific request path or pattern onto a controller
public class AdminController implements IAdminController{
	Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired                   // To establish relationship with admin service
	private AdminService adminService;
	
	@GetMapping("/{id}")                // To get the admin record based on admin id
	public @ResponseBody Admin getAdminById(@PathVariable Integer id)
	{
		logger.info("User is trying to get records based on id. ");
		return adminService.getAdminById(id);
		
	}
	@PostMapping("/")           // @PostMapping is used to insert admin records 
	public @ResponseBody Admin insertAdmin(@RequestBody Admin admin)
	{
		return adminService.insertAdmin(admin);
	}
	@PutMapping("/")              //@PutMapping is used to update admin records
	public @ResponseBody Admin updateAdmin(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
		
	}
	
	@DeleteMapping("/{id}")       // @DeleteMapping is used to delete admin records
	public @ResponseBody boolean deleteAdmin(@PathVariable Integer id)
	{
		return adminService.deleteAdminbyId(id);
	}
	
	@GetMapping("/")             // To get all the records in the table
	public @ResponseBody List<Admin> getAllAdmin()
	{
		List<Admin> adminlist=adminService.getAllAdmins();
		return adminlist;
	}
	
	
	
	
	
	
}
