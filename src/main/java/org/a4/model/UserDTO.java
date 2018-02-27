package org.a4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
	
	private Long id;
	private String username;
	private String password;
	private String email;

	@JsonCreator
	public UserDTO(@JsonProperty("id") Long id, @JsonProperty("username") String username,
			@JsonProperty("password") String password, @JsonProperty("email") String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public UserDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
