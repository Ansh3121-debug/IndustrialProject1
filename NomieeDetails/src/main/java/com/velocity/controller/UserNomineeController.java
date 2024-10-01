package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Nominee;
import com.velocity.model.User;
import com.velocity.service.NomineeService;
import com.velocity.service.UserService;

@RestController
public class UserNomineeController {

	@Autowired
	private UserService userService;

	@Autowired
	private NomineeService nomineeService;

	@PostMapping("/saveUserNominee")
	public User saveUserNominee(@RequestBody User user) {
		// Check if the nominee list is empty or null
		

		// Save the user
		User savedUser = userService.saveUser(user);

		// Assign the saved user to each nominee and save nominees
		List<Nominee> list = user.getNomineeList();
		for (Nominee nominee : list) {
			nominee.setUserId(user.getId()); // Set the entire user object, not just the ID
			nomineeService.saveNominee(nominee);
		}
		return savedUser;
	}
}
