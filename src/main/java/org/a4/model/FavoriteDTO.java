package org.a4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteDTO {
        private Long id;
	private Long postId;
        private Long userId;
        
        @JsonCreator
	public FavoriteDTO(@JsonProperty("id") Long id, @JsonProperty("postId") Long postId, @JsonProperty("userId") Long userId) {
		this.id = id;
		this.postId = postId;
                this.userId = userId;
	}
        public FavoriteDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
        
        public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}
        public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
