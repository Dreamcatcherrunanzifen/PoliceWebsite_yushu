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
<title>查看现有学校</title>
<link href="<%=path%>/lib/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=path%>/css/course_list.css" rel="stylesheet"
	type="text/css" />
<link href="<%=path%>/css/course_add.css" rel="stylesheet"
	type="text/css" />
	
<script type="text/javascript" language="javascript"
	src="<%=path%>/js/jquery-1.9.1.min.js"></script>

<script>
	function isDelete(school_id){
		var a=confirm("将删除与该學校相关的所有信息,确认删除？");
		if(a){
		//window.location.href="school_delete.action?schoolId=school_id";
			var url='school_delete.action?schoolId='+school_id+'&flag=1';
			window.location=url;
		}
	}
	function change_delete(){
		var a=confirm("确定删除所选信息？");
		if(a){
		document.forms.action="school_delete.action?flag=0";
	       
		 document.forms.submit();
		}
	}
	function getlist()
	{
	     var typeid=$("#articleType").val();
	     alert(typeid);
	     $.ajax({
			url : "getListBytypeId.action?typeId=" + typeid,
			method : "get",
			success : function(text) {
				
			}
		});
	}
</script>
</head>

<body>
	<div id="content">
		<form name="forms" method="post" enctype="multipart/form-data">
		<select class="selectpicker" name="articleType" onchange="getlist()" id="articleType">
							<s:iterator value="typelist">
									<option value="<s:property value="typeId"/>"><s:property value="typeName"/></option>
							</s:iterator>
							</select>
			<table width="100%" border="1" cellspacing="0" cellpadding="5">
				<tr id="title_head">
					<td width="5%"></td>
					<td width="31%">学校名</td>
					<td width="31%">学校地址</td>
					<td width="15%">学校类型</td>
					<td width="18%">操作</td>
				</tr>
				<s:iterator value="schoolList">
					<tr>
						<td><input type="checkbox" id="check" name="checklist"
							value="<s:property value="schoolId"/>" /></td>
						<td class="align_left"><s:property value="schoolName" /></td>
						<td class="align_left"><s:property value="schoolAddress" />
						</td>
						<td class="align_left"><s:property value="type.schoolType" />
						</td>
                        
						<td><a
							href="school_modify.action?schoolId=<s:property value="schoolId" />&dq=">[修改]</a>&nbsp;<a
							id="del" href="javascript:void(0)"
							onclick="isDelete(<s:property value="schoolId" />)">[删除]</a></td>
					</tr>
				</s:iterator>
			</table>
			<div class="page">

				<font size="3">共<font color="red"><s:property
							value="totalPage" /> </font>页 </font>|<font size="3">共<font color="red"><s:property
							value="allRows" /> </font>条记录</font>|


				<s:if test="currentPage == 1">
            首页&nbsp;&nbsp;&nbsp;上一页
        </s:if>

				<s:else>
					<a href="school_list.action">首页</a>
            |
            <a
						href="school_list.action?page=<s:property value="currentPage - 1"/>">
						&nbsp;|上一页</a>
				</s:else>

				<s:if test="#currentPage != totalPage">
					<a
						href="school_list.action?page=<s:property value="currentPage + 1"/>">下一页</a>
            &nbsp;|
            <a
						href="school_list.action?page=<s:property value="totalPage"/>">尾页</a>
				</s:if>

				<s:else>
            下一页&nbsp;|尾页
        </s:else>
				<form action="school_list.action" onsubmit="return validate();">
					<font size="4">跳转至</font> <input type="text" size="2" name="page">页
					<input type="submit" value="跳转">
				</form>
			</div>
			
			
			<div class="submits">
				<input class="buttons" type="button" title="保存" value="批量删除"
					onclick='change_delete()' />
			</div>
		</form>

	</div>




</body>
</html>

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

