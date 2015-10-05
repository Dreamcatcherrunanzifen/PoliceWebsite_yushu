package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * AbstractMessage entity provides the base persistence definition of the
 * Message entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMessage implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private String messageTitle;
	private String messageContent;
	private String publisherIp;
	private Timestamp publishTime;

	// Constructors

	/** default constructor */
	public AbstractMessage() {
	}

	/** full constructor */
	public AbstractMessage(String messageTitle, String messageContent,
			String publisherIp, Timestamp publishTime) {
		this.messageTitle = messageTitle;
		this.messageContent = messageContent;
		this.publisherIp = publisherIp;
		this.publishTime = publishTime;
	}

	// Property accessors

	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getPublisherIp() {
		return this.publisherIp;
	}

	public void setPublisherIp(String publisherIp) {
		this.publisherIp = publisherIp;
	}

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

}