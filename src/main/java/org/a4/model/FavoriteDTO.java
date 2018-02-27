package org.a4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteDTO {
        private Long id;
	private String body;
        
        @JsonCreator
	public FavoriteDTO(@JsonProperty("id") Long id, @JsonProperty("body") String body) {
		this.id = id;
		this.body = body;
	}
        public FavoriteDTO() {

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
        
}
