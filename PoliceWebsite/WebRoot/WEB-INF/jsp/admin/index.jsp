<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/index.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/ie.css">

	<script type="text/javascript" src="<%=path%>/include/jqueryeasyui/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="<%=path%>/include/jqueryeasyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/index.js"></script>
	<script type="text/javascript" src="<%=path%>/js/md5.js"></script>
	<script type="text/javascript" src="<%=path%>/js/login.js"></script>
	
	
  </head>
  
  <body class="easyui-layout" style="overflow-y: hidden; scroll="no">
	<div region="north" split="true" border="false" id="admin_status">

	<span style="float: right; padding-right: 20px;" class="head" >管理员： &nbsp;&nbsp;<a href="login" id="logout">安全退出</a></span>
	<span style="float: right; padding-right: 20px;" class="head">前台首页：<select id="course_select" onChange="changeUrl();">
		<option value="0">请选择课程...</option>
		
	       <option value="{% $k.course_id %}">课程名字</option>
		
	</select></span>
	<span style="padding-left: 15px; font-size: 16px;"><img src="images/video.png" align="absmiddle" style="padding-right: 15px" />翻转课堂视频管理平台</span>
	</div>
	<div region="south" style="height: 30px; background: #D2E0F2;"></div>
	<div region="west" hide="true" split="true" title="导航菜单"
		style="width: 220px;" id="west">
		<div id="nav" class="easyui-accordion" fit="true" border="false">
		</div>
	</div>
	<div id="mainPanle" region="center">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用" style="padding: 0px; overflow: hidden; color: grey; font-size: 16px; no-repeat;background:#F1FDFE; ">
			<p id="wel">
			欢迎进入
			</p>
			<p id="tit">
			翻转课堂视频管理平台
			</p>
			<!-- <img src="images/index_backbround.jpg" style="width:100%;height:100%"/><p>
			欢迎进入
			</p>
			<p>
			数据库
			</p> -->
			</div>
		</div>
	</div>

	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">取消</div>
	</div>
</body>
</html>
