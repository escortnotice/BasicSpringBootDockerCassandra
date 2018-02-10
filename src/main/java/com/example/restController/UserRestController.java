package com.example.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	UserService userService;

	@GetMapping("/user/All")
	public @ResponseBody Iterable<User> getAllCustomers() {
		return userService.getAllUsers();
	}
}
