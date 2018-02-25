package org.a4.repository;

import java.util.List;

import org.a4.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public List<User> getAllUsers() {
		Session session = factory.getCurrentSession();
		Query q = session.createQuery("SELECT u from org.a4.domain.User u");
		return q.list();
	}
	

}
