package com.yushu.hibernate;

import java.sql.Timestamp;

/**
 * AbstractCustoms entity provides the base persistence definition of the
 * Customs entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCustoms implements java.io.Serializable {

	// Fields

	private Integer customsinfoId;
	private String curstomsTitle;
	private String curstomsContent;
	private Timestamp adddate;

	// Constructors

	/** default constructor */
	public AbstractCustoms() {
	}

	/** full constructor */
	public AbstractCustoms(String curstomsTitle, String curstomsContent,
			Timestamp adddate) {
		this.curstomsTitle = curstomsTitle;
		this.curstomsContent = curstomsContent;
		this.adddate = adddate;
	}

	// Property accessors

	public Integer getCustomsinfoId() {
		return this.customsinfoId;
	}

	public void setCustomsinfoId(Integer customsinfoId) {
		this.customsinfoId = customsinfoId;
	}

	public String getCurstomsTitle() {
		return this.curstomsTitle;
	}

	public void setCurstomsTitle(String curstomsTitle) {
		this.curstomsTitle = curstomsTitle;
	}

	public String getCurstomsContent() {
		return this.curstomsContent;
	}

	public void setCurstomsContent(String curstomsContent) {
		this.curstomsContent = curstomsContent;
	}

	public Timestamp getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Timestamp adddate) {
		this.adddate = adddate;
	}

}