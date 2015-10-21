<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加警务动态</title>
<link href="<%=path%>/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=path%>/css/add.css" rel="stylesheet" type="text/css"/>


<script language="javascript" type="text/javascript"
	src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/course_add.js"></script>
<script type="text/javascript" language="javascript">
function removeSchool(obj){
		$(obj).parent().remove();
	}
	function addSchool(){
		 text="<div class='course_name_info'><span class='nameSpan2'>学校名称：      </span> <input type='text'size='40' name='school_name'/><a href='javascript:void(0)' onclick='removeChapter(this)' class='remove'>[删除]</a></div>";
		 text_addr="<div class='course_name_info'><span class='nameSpan2'>学校地址：       </span> <input type='text'size='40' name='school_addr'/><a href='javascript:void(0)' onclick='removeChapter(this)' class='remove'>[删除]</a></div>";
		 text_type="<div id='type_select'><span>选择学校类型：</span><select name='school_type' ><s:iterator value='type_list'><option value='<s:property value='schoolType'/>'><s:property value='schoolType'/></option></s:iterator></select> <a href='javascript:void(0)' onclick='removeSchool(this)' class='remove'>[删除]</a></div> "
	     $("#school").append(text);
	     $("#school").append(text_addr);
	     $("#school").append(text_type);
	}
	function checkSubmit(){
		if($("#school_name").val()==""){
     		alert("学校名不能为空!");
     		return false;
		}
		}
</script>
</head>
<body >
	<div id="frame1">
	<div id="frame2">
	<div id="content">
    <form action="addPolicedynamic.action" method="post" id="forms" onsubmit="recheckSubmit()" >
        请选择文章类型
   <div class="add"><a href='javascript:void(0)' onclick='addSchool()' class="add_button">继续添加学校信息</a></div>
   	<div><input class="buttons" type="submit" title="保存" name="submit"  value="保存" /></div>
    </form>
    </div>
    </div>
    </div>
</body>
</html>
