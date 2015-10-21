package com.yushu.hibernate;

/**
 * ImgCenter entity. @author MyEclipse Persistence Tools
 */
public class ImgCenter extends AbstractImgCenter implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImgCenter() {
	}

	/** full constructor */
	public ImgCenter(Article article, String imgSrc) {
		super(article, imgSrc);
	}

}
