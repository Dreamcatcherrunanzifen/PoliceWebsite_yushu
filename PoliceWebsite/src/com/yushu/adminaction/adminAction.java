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


public class adminAction extends ActionSupport {
	
	private String username;
	private String password;
	private String admin = "admin";
	private AdminuserDAO adminuserdao;
	private List<Adminuser> userlist;
	private String result;
	private String flag="";
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
		return flag;
	}
	public String login()
	{
		return SUCCESS;
	}
	public String check()
	{
		adminuserdao=new AdminuserDAO();
		userlist=adminuserdao.findAll();
		Map<String, String> map = new HashMap<String, String>();
		if(admin.equals(username))
		{
			if(password.equals(userlist.get(0).getPassword()))
			{
				map.put("information", "success");	
			}
			else
			{
				map.put("information", "error1");	
			}
		}
		else
		{
			map.put("information", "error2");	
		}
		JSONObject jo = JSONObject.fromObject(map);
		
		this.result = jo.toString();
		return SUCCESS;
	}
    public String change()
    {
    	return SUCCESS;
    }
    public String userpass()   
    {
    	adminuserdao=new AdminuserDAO();
    	
    	Adminuser admin=new Adminuser();
    	admin=(Adminuser)adminuserdao.findAll().get(0);
    	this.result=admin.getPassword();
    	return SUCCESS;
    }
    public String savepass()
    {
    	adminuserdao=new AdminuserDAO();
    	Adminuser admin=new Adminuser();
    	admin=adminuserdao.findById("1");
    	admin.setPassword(password);
    	adminuserdao.save(admin);
    	return SUCCESS;
    	
    }
}
