package com.yushu.hibernate;

/**
 * AbstractImgCenter entity provides the base persistence definition of the
 * ImgCenter entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImgCenter implements java.io.Serializable {

	// Fields

	private Integer imgId;
	private Article article;
	private String imgSrc;

	// Constructors

	/** default constructor */
	public AbstractImgCenter() {
	}

	/** full constructor */
	public AbstractImgCenter(Article article, String imgSrc) {
		this.article = article;
		this.imgSrc = imgSrc;
	}

	// Property accessors

	public Integer getImgId() {
		return this.imgId;
	}

	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getImgSrc() {
		return this.imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

}