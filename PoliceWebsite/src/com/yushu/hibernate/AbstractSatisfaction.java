package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * AbstractSatisfaction entity provides the base persistence definition of the
 * Satisfaction entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSatisfaction implements java.io.Serializable {

	// Fields

	private Integer satisfactionId;
	private Integer question;
	private String answer;
	private String publisherIp;
	private Timestamp publishDate;

	// Constructors

	/** default constructor */
	public AbstractSatisfaction() {
	}

	/** full constructor */
	public AbstractSatisfaction(Integer question, String answer,
			String publisherIp, Timestamp publishDate) {
		this.question = question;
		this.answer = answer;
		this.publisherIp = publisherIp;
		this.publishDate = publishDate;
	}

	// Property accessors

	public Integer getSatisfactionId() {
		return this.satisfactionId;
	}

	public void setSatisfactionId(Integer satisfactionId) {
		this.satisfactionId = satisfactionId;
	}

	public Integer getQuestion() {
		return this.question;
	}

	public void setQuestion(Integer question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPublisherIp() {
		return this.publisherIp;
	}

	public void setPublisherIp(String publisherIp) {
		this.publisherIp = publisherIp;
	}

	public Timestamp getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

}