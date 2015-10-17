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
		if ($("#articleFrom").val() == "") {
			alert("文章来源不能为空!");
			return false;
		}
		if ($("#articleTitle").val() == "") {
			alert("文章标题不能为空!");
			return false;
		}
		
		if ($("#articleAuthor").val() == "") {
			alert("文章作者不能为空!");
			return false;
		}
		if ($("#editor_id").val() == "") {
			alert("文章内容不能为空!");
			return false;
		}
		alert("保存成功!");
	}
	function clear()
	{

	    $("#articleFrom").attr("value","");
	    $("#articleTitle").val("");
	    $("#articleAuthor").val("");
	    $("#editor_id").val("");
	}
</script>

</head>
<body>
	<div id="frame1">
		<div id="frame2">
			<div id="content">
				<form action="addArticle.action" method="post" id="forms"
					onsubmit="return checkSubmit()">
					<table class="articletable">
						<tr>
							<td>文章类型</td>
							<td class="secondtd"><select class="selectpicker" name="articleType">
							<s:iterator value="typelist">
									<option value="<s:property value="typeId"/>"><s:property value="typeName"/></option>
							</s:iterator>
							</select>
							</td>
							<td>文章来源</td>
							<td><input type="text" id="articleFrom" class="form-control" name="articleFrom"
								placeholder="">
							</td>
						</tr>
						<tr>
							<td>文章标题</td>
							<td class="secondtd"><input type="text" id="articleTitle" name="articleTitle"
								class="form-control" placeholder="100个字以内">
							</td>
							<td>文章作者</td>
							<td><input type="text" id="articleAuthor" name="articleAuthor"
								class="form-control" placeholder="">
							</td>
						</tr>
					</table>
                     <textarea id="editor_id" name="content"
				style="width:760px;height:530px;margin-top:30px;">
				
				</textarea>
					<INPUT type="checkbox" name="check" value="yes" id="check">将文章中图片作为图片中心展览图片(默认第一张)
					<div class="button-click">
						<button class="btn btn-lg btn-primary btn-block" type="submit"
						>保存</button>
						<button class="btn btn-lg btn-primary btn-block" type="button"
						onclick="clear()">重置</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() { 
		KindEditor.ready(function(K) {
			var editor1 = K.create('#editor_id', {
				//自定义工具栏
				items : [ 'justifyleft', 'justifycenter', 'justifyright',
						'justifyfull', '|',  'fontname',
						'fontsize', '|', 'forecolor', 'hilitecolor', 'bold',
						'italic', 'underline', 'lineheight', 'removeformat',
						'|', 'image', 'multiimage',  'hr',
						'emoticons', 'baidumap', 'fullscreen','quickformat' ],
				uploadJson : 'ImgUpload.action', //图片上传Action
				
			//取消网络图片上传
			});
		});
	})
</script>
</html>
