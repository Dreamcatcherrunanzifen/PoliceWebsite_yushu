package com.yushu.hibernate;

/**
 * Adminuser entity. @author MyEclipse Persistence Tools
 */
public class Adminuser extends AbstractAdminuser implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Adminuser() {
	}

	/** full constructor */
	public Adminuser(String username, String password) {
		super(username, password);
	}

}
