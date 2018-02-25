package org.a4.service;

import java.util.List;

import org.a4.domain.Post;

public interface PostService {
	
	List<Post> getAllPosts();
	Post findPostById(Long id);
	Post addPost(Post post);
	Post updatePost(Post post);
	void deletePostById(Long id);

}
