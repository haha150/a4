/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.model;

/**
 *
 * @author davidren
 */

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CommentsDTO {
        private Long id;
        private Long postID;
        private String username;
        private String body;
        
        @JsonCreator
	public CommentsDTO(@JsonProperty("id") Long id, @JsonProperty("postID") Long postID,@JsonProperty("username") String username ,@JsonProperty("body") String body) {
		this.id = id;
                this.postID = postID;
                this.username = username;
		this.body = body;
	}
        public CommentsDTO() {

	}
        public Long getPostID() {
		return postID;
	}

	public void setPostID(Long postId) {
		this.postID = postID;
	}
        public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
        public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
        public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
