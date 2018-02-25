package org.a4.controller;

import java.util.List;
import java.util.UUID;

import org.a4.domain.User;
import org.a4.model.UserDTO;
import org.a4.service.MailService;
import org.a4.service.PostService;
import org.a4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class A4Controller {

	@Autowired
	UserService userService;

	@Autowired
	PostService postService;

	@Autowired
	private MailService mailService;

	@RequestMapping(value = "**", method = RequestMethod.GET)
	public ResponseEntity<String> handleInvalidCalls() {
		return new ResponseEntity<>("Call not supported!", HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/user/register", method = RequestMethod.PUT, consumes = { "application/json" })
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userToAdd) {
		List<User> users = userService.getAllUsers();
		for (User u : users) {
			if (u.getEmail().equalsIgnoreCase(userToAdd.getEmail())
					|| u.getUsername().equalsIgnoreCase(userToAdd.getUsername())) {
				return new ResponseEntity<>(null, HttpStatus.CONFLICT);
			}
		}
		if (!userToAdd.getEmail().contains("@kth.se")) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		User u = new User();
		u.setUsername(userToAdd.getUsername());
		u.setPassword(userToAdd.getPassword());
		u.setEmail(userToAdd.getEmail());
		u.setVerified(false);
		u.setUuid(UUID.randomUUID().toString());
		u = userService.addUser(u);
		userToAdd.setId(u.getId());
		mailService.sendMail(u.getEmail(), u.getUuid());
		return new ResponseEntity<>(userToAdd, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/user/verify/{key}", method = RequestMethod.POST)
	public ResponseEntity<String> verifyUser(@PathVariable String key) {
		List<User> users = userService.getAllUsers();
		for (User u : users) {
			if (u.getUuid().equals(key)) {
				u.setVerified(true);
				userService.updateUser(u);
				return new ResponseEntity<>("Successfully verified user " + u.getUsername(), HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Failed to verify user", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<User> loginUser(@RequestBody UserDTO userToLogin) {
		List<User> users = userService.getAllUsers();
		for (User u : users) {
			if (u.getUsername().equalsIgnoreCase(userToLogin.getUsername()) && u.getPassword().equalsIgnoreCase(userToLogin.getPassword())) {
				return new ResponseEntity<>(u, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}

}
