<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="Description" Content="后台用户登录页">
<title>玉树公安局后台管理系统</title>
<link href="<%=path%>/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=path%>/css/editpass.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="<%=path%>/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/login.js"></script>
<!--居中显示start-->
<script type="text/javascript"
	src="<%=path%>/js/common/center-plugin.js"></script>
<!--居中显示end-->
<style>
/*提示信息*/
#cursorMessageDiv {
	position: absolute;
	z-index: 99999;
	border: solid 1px #cc9933;
	background: #ffffcc;
	padding: 2px;
	margin: 0px;
	display: none;
	line-height: 150%;
}
/*提示信息*/
</style>
<script type="text/javascript">
	function onEnterDown() {

		if (window.event.keyCode == 13) {

			checkpass();

		}

	}
	function isRight(str) {
		var ls = 0;
		if (str.match(/([a-z])+/)) {
			ls++;
		}
		if (str.match(/([A-Z])+/)) {
			ls++;
		}
		if (str.match(/([0-9])+/)) {
			ls++;
		}
		if (str.match(/[^a-zA-Z0-9]+/)) {
			ls++;
		}
		return ls;
	}
	//使用 Ajax 的方式 判断登录   
	function checkpass() {
		var oldpass = $("#oldPass").val();
		var userpass = "";
		var new_pass = $("#newPass").val();
		var new_passconfirm = $("#newPass_confirm").val();
		$.ajax({
			url : "userpass.action",
			type : "get",
			async : false,
			success : function(data) {
				
				userpass = data;
				
			}

		});
		
		if (oldpass == userpass)//原始密码正确
		{
			if (new_pass.length >= 6) {
				if (isRight(new_pass) < 3) {
					$("#flag").text("密码复杂度不够!");
				} else {
					if (new_pass == new_passconfirm) {
						$("#flag").text("正在保存!");
						savePass();
					} else {
						$("#flag").text("两次输入密码不一致!");
					}
				}
			} else {
				$("#flag").text("密码至少6位!");
			}
		}
		else
		{  
		     $("#flag").text("密码错误!");
		}

	}
	function savePass() {
        var pass_word=$("#newPass").val().trim();
		var params = {
			"password" : pass_word
		};
          
		$.ajax({
			url : 'savepass.action',
			type : 'post',
			data : params,
			dataType : 'json',
			success : function(data) {
				//alert(data);
				alert("保存成功！");
			}

		});

	}
</script>
</head>
<body onkeydown="onEnterDown();">

	<header>
		<img src="<%=path%>/images/key.png" />修改密码
		<div class="form-tab">
			<div class="inner cover">
				<form class="form-signin">
					
					<input type="password" id="oldPass" class="form-control" placeholder="原始密码"
						> 
					<input type="password" id="newPass" class="form-control"
						placeholder="新密码 密码最小长度为6位（必须包括数字、英文字母大写和小写）">
				 <input type="password"
						id="newPass_confirm" class="form-control" placeholder="确认密码"
						> 
					<button class="btn btn-lg btn-primary btn-block" type="button"
						onclick="checkpass()">保存</button>
					<label id="flag"></label>
				</form>
			</div>
		</div>

	</header>
</body>
</html>
