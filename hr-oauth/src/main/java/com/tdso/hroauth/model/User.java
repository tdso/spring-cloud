package com.tdso.hroauth.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private String email;
	private String password;

	private Set<Role> roles = new HashSet<>();
	
	public User(){}

	public User(Long id, String name, String email, String senha) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = senha;
	}
	
	public Set<Role> getRoles(){
		return this.roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return password;
	}

	public void setSenha(String senha) {
		this.password = senha;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", roles=" + roles
				+ "]";
	}
	
	
	
	

}
