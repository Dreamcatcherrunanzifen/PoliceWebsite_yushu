package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * Customs entity. @author MyEclipse Persistence Tools
 */
public class Customs extends AbstractCustoms implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Customs() {
	}

	/** full constructor */
	public Customs(String curstomsTitle, String curstomsContent,
			Timestamp adddate) {
		super(curstomsTitle, curstomsContent, adddate);
	}

}
