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
<title>添加图片</title>
<link href="<%=path%>/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=path%>/css/add.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" charset="utf-8"
	src="<%=path%>/include/editor/kindeditor.js"></script>
<script charset="utf-8" src="<%=path%>/include/editor/lang/zh_CN.js"></script>
<script language="javascript" type="text/javascript"
	src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	var editor = (KindEditor)
	document.getElementById("editor_id");
	editor.toolbarBgColor = '#B8750C';
</script>
<script type="text/javascript" language="javascript">
	
	function checkSubmit() {
		
		alert("保存成功!");
	}
	function clear()
	{

	    $("#articleFrom").attr("value","");
	    $("#articleTitle").val("");
	    $("#articleAuthor").val("");
	    $("#editor_id").val("");
	}
	function upload()
	{
	      $(".addimg_panel").removeClass("hidden");
	}
	function close()
	{
	      $(".addimg_panel").addClass("hidden");
	}
</script>

</head>
<body>
	<div id="frame1">
		<div id="frame2">
			<div id="content">
				<form action="ImgUpload.action" method="post" id="forms"
					onsubmit="return checkSubmit()">
					<ul>
					<li>
					<s:iterator value="typelist">
									<option value="<s:property value="typeId"/>"><s:property value="typeName"/></option>
					</s:iterator>
					</li>
					
					</ul>
				   <input type="button" value="上传图片" onclick="upload()"/>
					
				</form>
				
			</div>
		</div>
	</div>
	<div class="addimg_panel hidden">
						说明：第二个按钮为上传单张图片，第二个按钮为批量上传图片
						<textarea id="editor_id" name="content"
							style="width:760px;height:530px;margin-top:30px;">
				
				</textarea>
						<input type="submit" value="保存" />
						<input type="button" value="关闭" onclick="close()" />
					</div>
</body>
<script type="text/javascript">
	$(function() { 
		KindEditor.ready(function(K) {
			var editor1 = K.create('#editor_id', {
				//自定义工具栏
				
				items : [ 
						 'image','|', 'multiimage'],
				uploadJson : 'ImgUpload.action', //图片上传Action
				
			//取消网络图片上传
			});
		});
	})
</script>
</html>
