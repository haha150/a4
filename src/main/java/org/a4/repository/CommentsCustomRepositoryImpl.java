/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.repository;

import java.util.List;
import org.a4.domain.Comments;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author davidren
 */

@Repository
public class CommentsCustomRepositoryImpl implements CommentsCustomRepository {
     @Autowired
	private SessionFactory factory;

	@Override
	public List<Comments> getAllComments() {
		Session session = factory.getCurrentSession();
		Query q = session.createQuery("SELECT u from org.a4.domain.Comments u");
		return q.list();
	}
}
