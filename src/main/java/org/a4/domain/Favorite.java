/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.domain;

/**
 *
 * @author davidren
 */

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Favorite")
@Table(name = "favorite")
public class Favorite {
        
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
        @OneToOne
	@JoinColumn(name = "post_id")
	private Post post;
        
        
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
        
        
        public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
