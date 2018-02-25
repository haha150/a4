package org.a4.service;

import java.util.List;

import org.a4.domain.User;
import org.a4.repository.UserCustomRepository;
import org.a4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserCustomRepository userCustomRepo;
	

	@Override
	public List<User> getAllUsers() {
		return userCustomRepo.getAllUsers();
	}

	@Override
	public User findUserById(Long id) {
		return userRepo.findById(id);
	}

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

}
