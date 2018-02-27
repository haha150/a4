package org.a4.service;

import java.util.List;


import org.a4.domain.Post;
import org.a4.repository.PostCustomRepository;
import org.a4.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	PostCustomRepository postCustomRepo;

	@Override
	public List<Post> getAllPosts() {
		return postCustomRepo.getAllPosts();
	}

	@Override
	public Post findPostById(Long id) {
		return postRepo.findById(id);
	}

	@Override
	public Post addPost(Post post) {
		return postRepo.save(post);
	}

	@Override
	public Post updatePost(Post post) {
		return postRepo.save(post);
	}

	@Override
	public void deletePostById(Long id) {
		postRepo.delete(id);
	}

}
