package com.sprinttwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.sprinttwo.controller.AdminController;
import com.sprinttwo.dto.Admin;
import com.sprinttwo.service.AdminService;



@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ApplicationTests {
	private MockMvc mockMvc;
	@Mock
	AdminService adminServices;

	@InjectMocks
	AdminController adminController;
	@Test
	void contextLoads() {
		Admin admin = new Admin();
		Mockito.when(adminController.insertAdmin(admin)).thenReturn(admin);
		assertEquals(admin, adminController.insertAdmin(admin));
	}

}
