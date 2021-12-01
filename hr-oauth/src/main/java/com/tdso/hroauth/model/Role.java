package com.tdso.hroauth.model;

import java.io.Serializable;


public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String roleName;
	
	public Role() {}

	public Role(Long id, String rolename) {
		this.id = id;
		this.roleName = rolename;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRolename() {
		return roleName;
	}

	public void setRolename(String rolename) {
		this.roleName = rolename;
	}
	
	

}
