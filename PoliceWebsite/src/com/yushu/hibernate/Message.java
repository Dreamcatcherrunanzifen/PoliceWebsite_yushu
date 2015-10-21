package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */
public class Message extends AbstractMessage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(String messageTitle, String messageContent,
			String publisherIp, Timestamp publishTime) {
		super(messageTitle, messageContent, publisherIp, publishTime);
	}

}
