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
<link href="<%=path%>/css/teaching_video_add.css" rel="stylesheet" type="text/css"/>
<link href="<%=path%>/css/course_add.css" rel="stylesheet" type="text/css"/>
<script language="javascript" type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/include/tinymce/tiny_mce.js"> </script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/tinymce_kcfinder_config.js"></script>
<script>
	
</script>

<title>获取文章列表</title>
</head>
<body>
  	<s:iterator value="articlelist">
  	<p><s:property value="articleTitle"/></p>
  	<p><s:property value="articleContent"/></p>
  	</s:iterator>
  	<p>ok</p>
</body>
</html>
