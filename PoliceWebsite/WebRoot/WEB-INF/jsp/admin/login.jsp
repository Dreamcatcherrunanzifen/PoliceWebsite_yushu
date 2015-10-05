<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<meta name="Author" content="yanchao">
<meta name="Generator" Content="eclipse indigo">
<meta name="Date" Content="2013-7-23下午4:20:35">
<meta name="Description" Content="后台用户登录页">
<title>玉树公安局后台管理系统</title>
<link href="<%=path%>/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
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

			login();

		}

	}
	//使用 Ajax 的方式 判断登录   
	function login() {
		var user_name = $("#username").val();
		var pass_word = $("#password").val();
        $("#flag").html("正在登录...");
		var params = {
			"username" : user_name,
			"password" : pass_word
		};

		$.ajax({
			url : 'logincheck.action',
			type : 'post',
			data : params,
			dataType : 'json',
			success : function(data) {
				//alert(data);
				var member = eval("(" + data + ")");
				
				switch (member.information) {
				case "error2":
					$("#flag").html("用户" + params.username + "不存在！");
					break;
				case "error1":
					$("#flag").html("用户" + params.username + "的密码不正确！");
					break;
				case "teacher":
					location.href = 'index_t.action';
					break;
				case "admin":
					location.href = 'index.action';
					break;
				}
			}

		});
	}
</script>
</head>
<body onkeydown="onEnterDown();">
	<div class="login_main">
		<div class="login_top"></div>
		<div class="login_middle">
			<div class="login_middleleft"></div>
			<div class="login_middlecenter">

				<div class="login_user">
					<input type="text" id="username" name="admin_name">
				</div>
				<div class="login_pass">
					<input type="password" id="password" name="admin_pwd">
				</div>

				<div class="clear"></div>
				<div class="login_button">
					<div class="login_button_left">
						<input type="submit" id="btn_login" value=""
							onclick="login()" />
					</div>
					<div class="login_button_right">
						<input type="reset" value="" />
					</div>
					<div class="register">
						<a href="register">修改密码  </a>
					</div>
					<span id="flag"></span>
				</div>

				<div class="login_info" style="display:none;"></div>
			</div>
			<div class="login_middleright"></div>
			<div class="clear"></div>
		</div>
		<div class="login_bottom">
			<div class="login_copyright"></div>
		</div>
	</div>

</body>
</html>
