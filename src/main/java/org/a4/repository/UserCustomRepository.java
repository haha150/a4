package org.a4.repository;

import java.util.List;

import org.a4.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCustomRepository {
	List<User> getAllUsers();

}
