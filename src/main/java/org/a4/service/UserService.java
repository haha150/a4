package org.a4.service;

import java.util.List;

import org.a4.domain.User;

public interface UserService {
	
	List<User> getAllUsers();
	User findUserById(Long id);
	User addUser(User user);
	User updateUser(User user);

}
