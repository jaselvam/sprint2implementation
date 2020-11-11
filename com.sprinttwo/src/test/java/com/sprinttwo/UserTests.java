package com.sprinttwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.sprinttwo.controller.UserController;
import com.sprinttwo.dto.User;
import com.sprinttwo.service.UserService;



@ExtendWith(MockitoExtension.class)
public class UserTests {
	private MockMvc mockMvc;
	@Mock
	UserService userServices;

	@InjectMocks
	UserController userController;
	@Test
	void testInsertUser() {
		User user = new User("janani","karthikA123","admin");
		Mockito.when(userController.insertUser(user)).thenReturn(user);
		assertEquals(user, userController.insertUser(user));
		assertEquals(user.getUserName(),userController.insertUser(user).getUserName());
		assertEquals(user.getUserPassword(),userController.insertUser(user).getUserPassword());
		assertEquals(user.getRole(),userController.insertUser(user).getRole());
	}
	@Test
	void testLogoutUser() {
		User user = new User("janani","karthikA123","admin");
		String str=user.getUserName()+" has logged out successfully";
		Mockito.when(userController.logout(user)).thenReturn(str);
	    assertEquals(str,userController.logout(user));
	}
	@Test
	void testLoginUser() {
		User user = new User("janani","karthikA123","admin");
		String str=user.getUserName()+" has successfully logged in";
		Mockito.when(userController.logout(user)).thenReturn(str);
	    assertEquals(str,userController.logout(user));
	}
	@Test
	void testdeleteUser() {
		 boolean b= true;
		 String userName="janani";
		 Mockito.when(userController.deleteUser(userName)).thenReturn(b);
	     assertEquals(b,userController.deleteUser(userName));
	}
}
