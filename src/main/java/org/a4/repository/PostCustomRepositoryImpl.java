package org.a4.repository;

import java.util.List;

import org.a4.domain.Post;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostCustomRepositoryImpl implements PostCustomRepository {

	@Autowired
	private SessionFactory factory;

	@Override
	public List<Post> getAllPosts() {
		Session session = factory.getCurrentSession();
		Query q = session.createQuery("SELECT p from org.a4.domain.Post p");
		return q.list();
	}

}
