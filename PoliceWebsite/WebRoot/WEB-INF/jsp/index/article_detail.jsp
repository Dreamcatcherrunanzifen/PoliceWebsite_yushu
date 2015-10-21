<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
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

<body>
	<div class='m-header'>
	</div>
	<div class='m-menu'>
		<ul class='menuWrap'>
			<li class='menuItem'>首页</li>
			<li class='menuItem'>机构设置</li>
			<li class='menuItem'>警务动态</li>
			<li class='menuItem'>信息公开</li>
			<li class='menuItem'>玉树风情</li>
			<li class='menuItem'>满意度调查</li>
			<li class='menuItem'>留言板</li>
			<li class='menuItem'>网站管理</li>
		</ul>
	</div>
	<div class='g-main'>
		<div class="m-artiDetail">
			<div class='nav'>
				<span>您的当前位置：</span> <a href="">首页</a>> <a href="">信息公开</a> > <a
					href="" class="curr">文章详情</a>
			</div>
			<div class="detail">
				<p class="title">出入境管理处开展“趣味运动会”活动</p>
				<p class="time">来源：玉树自治州公安局 发布时间：2015-10-15 阅读次数：225</p>
				<div class="content">
					10月10日下午，出入境管理处全体民警及协勤辅警人员在处长汪玉芳的组织下利用工作之余在我处办证大厅内开展了“趣味运动会”活
					动。会上，开展的活动有“绑腿赛跑”、“跳绳”、“抢板凳”等，全体民警及协勤辅警人员积极参加，运动热情高涨，一片欢声笑语。此
					次活动的开展加强了我处全体民警及协勤辅警人员凝聚力，战斗力及团结协作能力，并且缓解了平时工作中的压力，得到了大家的一致好评。
					10月10日下午，出入境管理处全体民警及协勤辅警人员在处长汪玉芳的组织下利用工作之余在我处办证大厅内开展了“趣味运动会”活
					动。会上，开展的活动有“绑腿赛跑”、“跳绳”、“抢板凳”等，全体民警及协勤辅警人员积极参加，运动热情高涨，一片欢声笑语。此
					次活动的开展加强了我处全体民警及协勤辅警人员凝聚力，战斗力及团结协作能力，并且缓解了平时工作中的压力，得到了大家的一致好评。</div>

				<div class="preNext">
					<p class="title f-fl">上一篇：甘河分局：开展心理健康知识培训</p>
					<p class="title f-fr">下一篇：载誉归来，一荣俱荣</p>
				</div>
			</div>
		</div>

	</div>
	<div class="m-footer">
		<p class="p">
			版权所有 玉树藏族自治州公安局 All Rights Reserved<br />Copyright 2015
		</p>
	</div>
</body>
</html>
