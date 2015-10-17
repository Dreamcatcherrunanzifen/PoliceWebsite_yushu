package com.yushu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yushu.hibernate.ArticleDAO;
import com.yushu.hibernate.Article;
import com.yushu.hibernate.ImgCenter;
import com.yushu.hibernate.ImgCenterDAO;


public class indexAction extends ActionSupport {
	
    private ArticleDAO articledao;
    private ImgCenterDAO imgcenterdao;
    private List<Article> articlelist;
    private List<ImgCenter> imglist;
	public ImgCenterDAO getImgcenterdao() {
		return imgcenterdao;
	}
	public void setImgcenterdao(ImgCenterDAO imgcenterdao) {
		this.imgcenterdao = imgcenterdao;
	}
	public List<ImgCenter> getImglist() {
		return imglist;
	}
	public void setImglist(List<ImgCenter> imglist) {
		this.imglist = imglist;
	}
	public ArticleDAO getArticledao() {
		return articledao;
	}
	public void setArticledao(ArticleDAO articledao) {
		this.articledao = articledao;
	}
	public List<Article> getArticlelist() {
		return articlelist;
	}
	public void setArticlelist(List<Article> articlelist) {
		this.articlelist = articlelist;
	}
	public String list()
	{
		
		return SUCCESS;
	}

}
