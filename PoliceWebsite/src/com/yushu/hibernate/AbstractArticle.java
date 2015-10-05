package com.yushu.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractArticle entity provides the base persistence definition of the
 * Article entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArticle implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Type type;
	private String articleTitle;
	private String articleContent;
	private String articleAuthor;
	private Timestamp publishTime;
	private Integer articleClick;
	private String articleFrom;
	private Set imgCenters = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractArticle() {
	}

	/** minimal constructor */
	public AbstractArticle(Type type, String articleTitle,
			String articleContent, Timestamp publishTime, Integer articleClick,
			String articleFrom) {
		this.type = type;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.publishTime = publishTime;
		this.articleClick = articleClick;
		this.articleFrom = articleFrom;
	}

	/** full constructor */
	public AbstractArticle(Type type, String articleTitle,
			String articleContent, String articleAuthor, Timestamp publishTime,
			Integer articleClick, String articleFrom, Set imgCenters) {
		this.type = type;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleAuthor = articleAuthor;
		this.publishTime = publishTime;
		this.articleClick = articleClick;
		this.articleFrom = articleFrom;
		this.imgCenters = imgCenters;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleAuthor() {
		return this.articleAuthor;
	}

	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public Integer getArticleClick() {
		return this.articleClick;
	}

	public void setArticleClick(Integer articleClick) {
		this.articleClick = articleClick;
	}

	public String getArticleFrom() {
		return this.articleFrom;
	}

	public void setArticleFrom(String articleFrom) {
		this.articleFrom = articleFrom;
	}

	public Set getImgCenters() {
		return this.imgCenters;
	}

	public void setImgCenters(Set imgCenters) {
		this.imgCenters = imgCenters;
	}

}