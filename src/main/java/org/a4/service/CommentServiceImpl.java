/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.service;

import java.util.List;
import org.a4.domain.Comments;
import org.a4.repository.CommentsCustomRepository;
import org.a4.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author davidren
 */
@Transactional
@Service
public class CommentServiceImpl implements CommentService{
        @Autowired
        CommentsRepository commentRepo;
	
	@Autowired
	CommentsCustomRepository commentCustomRepo;

	@Override 
        public List<Comments> getAllComments(){
            return commentCustomRepo.getAllComments();
        }
        @Override 
        public Comments addComment(Comments comment){
            return commentRepo.save(comment);
        }
        @Override 
        public Comments updateComment(Comments comment){
            return commentRepo.save(comment);
        }
        @Override 
        public void deleteCommentById(Long id){
            commentRepo.delete(id);
        }
}
