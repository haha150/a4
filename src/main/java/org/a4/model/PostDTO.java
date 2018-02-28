package org.a4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostDTO {

	private Long id;
	private String title;
	private String body;
	private boolean anonymous;
	private String username;
	private String courseCode;

	@JsonCreator
	public PostDTO(@JsonProperty("id") Long id, @JsonProperty("title") String title, @JsonProperty("body") String body,
			@JsonProperty("anonymous") boolean anonymous, @JsonProperty("username") String username, @JsonProperty("coursecode") String courseCode) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.anonymous = anonymous;
		this.username = username;
		this.courseCode = courseCode;
	}

	public PostDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
