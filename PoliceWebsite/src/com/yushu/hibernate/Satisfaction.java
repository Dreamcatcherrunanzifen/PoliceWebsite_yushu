package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * Satisfaction entity. @author MyEclipse Persistence Tools
 */
public class Satisfaction extends AbstractSatisfaction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Satisfaction() {
	}

	/** full constructor */
	public Satisfaction(Integer question, String answer, String publisherIp,
			Timestamp publishDate) {
		super(question, answer, publisherIp, publishDate);
	}

}
