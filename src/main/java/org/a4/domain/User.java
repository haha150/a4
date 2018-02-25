package org.a4.domain;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "username", unique = true, length = 20, nullable = false)
	private String username;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@Column(name = "email", unique = true, length = 20, nullable = false)
	private String email;
	
	@Column(name = "verified", nullable = false)
	private boolean verified;
	
	@Column(name = "uuid", unique = true, length = 20, nullable = false)
	private String uuid;

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

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	

}
