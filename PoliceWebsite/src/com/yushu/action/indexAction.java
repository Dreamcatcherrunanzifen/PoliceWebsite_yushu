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
    private String result;
    private String articletype;

	public String getArticletype() {
		return articletype;
	}
	public void setArticletype(String articletype) {
		this.articletype = articletype;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
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
	public String home()
	{
		articledao=new ArticleDAO();
		articlelist=articledao.findAll();
		
		return SUCCESS;
	}
	public String detail()
	{
		System.out.println("success");
		return SUCCESS;
	}
	public String list()
	{
		articledao=new ArticleDAO();
		articlelist=articledao.findAll();
		
		
		JSONArray jsonArray = new JSONArray();
		int length=0;
		for(int i=0;i<articlelist.size();i++)
		{
			
			if(articlelist.get(i).getType().getTypeId()==Integer.parseInt(articletype)){
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("articleTitle", articlelist.get(i).getArticleTitle());
				jsonObject.put("addDate", articlelist.get(i).getPublishTime());

    private String articleId;
    private Article article;
    
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getArticletype() {
		return articletype;
	}
	public void setArticletype(String articletype) {
		this.articletype = articletype;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
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
	public String home()
	{
		articledao=new ArticleDAO();
		articlelist=articledao.findAll();
		
		return SUCCESS;
	}
	public String detail()
	{
		articledao=new ArticleDAO();
		article=articledao.findById(Integer.parseInt(articleId));
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("articleTitle", article.getArticleTitle());
		jsonObject.put("addDate", article.getPublishTime().toLocaleString());
		jsonObject.put("author", article.getArticleAuthor());
		jsonObject.put("articleId", article.getArticleId());
		jsonObject.put("articleCont", article.getArticleContent());
		jsonObject.put("articleType", article.getType().getTypeId());
		jsonObject.put("articleTypeName", article.getType().getTypeName());
		jsonObject.put("articleClick", article.getArticleClick());
		jsonObject.put("articleFrom", article.getArticleFrom());
		jsonObject.put("articleBefore", articledao.findById(Integer.parseInt(articleId)-1).getArticleTitle());
		jsonObject.put("articleAfter", articledao.findById(Integer.parseInt(articleId)+1).getArticleTitle());
		
		result=jsonObject.toString();
		return SUCCESS;
	}
	public String list()
	{
		articledao=new ArticleDAO();
		articlelist=articledao.findAll();
		
		
		JSONArray jsonArray = new JSONArray();
		int length=0;
		for(int i=0;i<articlelist.size();i++)
		{
			
			if(articlelist.get(i).getType().getTypeId()==Integer.parseInt(articletype)){
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("articleTitle", articlelist.get(i).getArticleTitle());
				jsonObject.put("addDate", articlelist.get(i).getPublishTime().toLocaleString());

				jsonObject.put("author", articlelist.get(i).getArticleAuthor());
				jsonObject.put("articleId", articlelist.get(i).getArticleId());
				jsonObject.put("articleCont", articlelist.get(i).getArticleContent());
				jsonObject.put("articleType", articlelist.get(i).getType().getTypeId());
				jsonObject.put("articleTypeName", articlelist.get(i).getType().getTypeName());
				
				jsonArray.add(length, jsonObject);
				length++;
			}
			
			
		}
	    result=jsonArray.toString();
		return SUCCESS;
	}
	public String imgListGet(){
		imgcenterdao=new ImgCenterDAO();
		imglist=imgcenterdao.findAll();

		JSONArray jsonArray = new JSONArray();
		for(int i=0;i<imglist.size();i++)
		{
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("imgId", imglist.get(i).getImgId());
				jsonObject.put("imgUrl", imglist.get(i).getImgSrc());
				jsonObject.put("imgArticle", imglist.get(i).getArticle().getArticleId());
				jsonArray.add(i, jsonObject);
			
		}
		
		result=jsonArray.toString();
		
		return SUCCESS;
	}

}
