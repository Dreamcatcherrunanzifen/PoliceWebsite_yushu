package com.yushu.hibernate;

import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */
public class Type extends AbstractType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(String typeName) {
		super(typeName);
	}

	/** full constructor */
	public Type(String typeName, Set articles) {
		super(typeName, articles);
	}

}
