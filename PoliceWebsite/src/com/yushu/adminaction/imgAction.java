package com.yushu.adminaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yushu.hibernate.Adminuser;
import com.yushu.hibernate.AdminuserDAO;
import com.yushu.hibernate.Article;
import com.yushu.hibernate.ArticleDAO;
import com.yushu.hibernate.Type;
import com.yushu.hibernate.TypeDAO;


public class imgAction extends ActionSupport {
	
	private String username;
	private String password;
	private String admin = "admin";
	private AdminuserDAO adminuserdao;
	private ArticleDAO articledao;
	private List<Adminuser> userlist;
	private List<Type> typelist;
	private String result;
	private String content;
	private TypeDAO typedao;
	private String articleFrom;
	private String articleTitle;
	private String articleAuthor;
	private String articleType;
	private Article article;
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public AdminuserDAO getAdminuserdao() {
		return adminuserdao;
	}
	public void setAdminuserdao(AdminuserDAO adminuserdao) {
		this.adminuserdao = adminuserdao;
	}
	public ArticleDAO getArticledao() {
		return articledao;
	}
	public void setArticledao(ArticleDAO articledao) {
		this.articledao = articledao;
	}
	public List<Adminuser> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<Adminuser> userlist) {
		this.userlist = userlist;
	}
	public TypeDAO getTypedao() {
		return typedao;
	}
	public void setTypedao(TypeDAO typedao) {
		this.typedao = typedao;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getArticleType() {
		return articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
	public String getArticleFrom() {
		return articleFrom;
	}
	public void setArticleFrom(String articleFrom) {
		this.articleFrom = articleFrom;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleAuthor() {
		return articleAuthor;
	}
	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<Type> getTypelist() {
		return typelist;
	}
	public void setTypelist(List<Type> typelist) {
		this.typelist = typelist;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute()
	{
		return SUCCESS;
	}
	public String login()
	{
		return SUCCESS;
	}
	public String add()
	{
		typedao=new TypeDAO();
		articledao=new ArticleDAO();
		Type type=typedao.findById(Integer.parseInt(articleType));
		article=new Article(type,articleTitle,content,articleAuthor,new Timestamp(System.currentTimeMillis()),0,articleFrom);
		articledao.save(article);
		
		return SUCCESS;
	}
	public String typelist()
	{
		typedao=new TypeDAO();
		typelist=typedao.findAll();
		return SUCCESS;
	}
	public String list()
	{
		return SUCCESS;
	}
}
