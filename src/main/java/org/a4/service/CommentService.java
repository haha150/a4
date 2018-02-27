/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.service;

import java.util.List;
import org.a4.domain.Comments;

/**
 *
 * @author davidren
 */
public interface CommentService {
    List<Comments> getAllComments();
    Comments addComment(Comments post);
    Comments updateComment(Comments post);
    void deleteCommentById(Long id);
}
