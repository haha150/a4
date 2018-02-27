package org.a4.repository;

import java.util.List;

import org.a4.domain.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCustomRepository {
	List<Post> getAllPosts();
}
