package com.yushu.hibernate;

/**
 * AbstractAdminuser entity provides the base persistence definition of the
 * Adminuser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdminuser implements java.io.Serializable {

	// Fields

	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractAdminuser() {
	}

	/** full constructor */
	public AbstractAdminuser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}