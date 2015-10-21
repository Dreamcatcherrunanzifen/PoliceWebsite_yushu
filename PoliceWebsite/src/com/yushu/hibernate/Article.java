package com.yushu.hibernate;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */
public class Article extends AbstractArticle implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(Type type, String articleTitle, String articleContent,String articleAuthor,
			Timestamp publishTime, Integer articleClick, String articleFrom) {
		super(type, articleTitle, articleContent, articleAuthor,publishTime, articleClick,
				articleFrom);
	}

	/** full constructor */
	public Article(Type type, String articleTitle, String articleContent,
			String articleAuthor, Timestamp publishTime, Integer articleClick,
			String articleFrom, Set imgCenters) {
		super(type, articleTitle, articleContent, articleAuthor, publishTime,
				articleClick, articleFrom, imgCenters);
	}

}
