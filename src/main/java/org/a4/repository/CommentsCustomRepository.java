/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.repository;

/**
 *
 * @author davidren
 */
import java.util.List;
import org.a4.domain.Comments;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsCustomRepository {
    List<Comments> getAllComments();
}
