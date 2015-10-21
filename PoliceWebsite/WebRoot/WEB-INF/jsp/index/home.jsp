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
<link href="<%=path%>/css/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/css/main.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/js/base/angular-carousel/angular-carousel.min.css"
	rel="stylesheet" type="text/css" />

<script language="javascript" type="text/javascript"
	src="<%=path%>/js/base/angular-1.3.16/angular.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/base/angular-1.3.16/angular-touch.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/base/angular-1.3.16/angular-route.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/base/angular-carousel/angular-carousel.min.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/base/jQuery/jquery-1.9.1.min.js"></script>

<title>玉树藏族自治州公安局</title>
</head>
<body ng-app='sysYushuApp' ng-controller='appCtrl'>
	<div class='m-header'></div>
	<div class='m-menu'>
		<ul class='menuWrap'>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='home'}" ng-click="changePath('home')">首页</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='instituSetting'}" ng-click="changePath('instituSetting')">机构设置</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='policeDy'}" ng-click="changePath('policeDy')">警务动态</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='infoPublic'}" ng-click="changePath('infoPublic')">信息公开</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='aboutYushu'}" ng-click="changePath('aboutYushu')">玉树风情</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='satisfaction'}" ng-click="changePath('satisfaction')">满意度调查</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='liveMessage'}" ng-click="changePath('liveMessage')">留言板</li>
			<li class='menuItem' ng-class="{'z-active':menuSelected=='manage'}" ng-click="changePath('manage')">网站管理</li>
		</ul>
	</div>
	<ng-view></ng-view>
	<div class="m-footer">
		<p class="p">
			版权所有 玉树藏族自治州公安局 All Rights Reserved<br />Copyright 2015
		</p>
	</div>
</body>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/app.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/directives/module_list_dire.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/directives/images_list_dire.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/directives/sina_wechat_dire.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/filter/common_filter.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/home_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/instituSetting_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/policeDy_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/infoPublic_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/aboutYushu_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/satisfaction_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/liveMessage_ctrl.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/sysYushu/controllers/manage_ctrl.js"></script>


</html>
