$(document).ready(function() {
	InitLeftMenu();
	tabClose();
	tabCloseEven();
	/* $(window).resize(function() {
	resize();
	});
	*/
	/*
	$('#tabs').tabs('add',{
			title:"欢迎使用",
			content:createFrame("index.php?r=index/welcome"),
			closable:false
	});
	*/
	  $('#logout').click(function(){
                        location.href = 'index.php?r=admin/logout';
                });
	 var width=$(window).width()-220+16;
	  $("#mainPanle").css("width",width+"px");
});
var _menus = {"menus":[
						{"menuid":"1","icon":"icon-sys","menuname":"发表文章管理",
							"menus":[
									{"menuid":"11","menuname":"添加文章","icon":"icon-add","url":"getaddPanel.action"},
									{"menuid":"12","menuname":"现有文章","icon":"icon-nav","url":"listArticle.action"}
									]
						},
						
						{"menuid":"2","icon":"icon-sys","menuname":"图片中心管理",
							"menus":[
									{"menuid":"11","menuname":"添加图片","icon":"icon-add","url":"getaddimgPanel.action"},
									{"menuid":"12","menuname":"现有图片","icon":"icon-nav","url":"listImg.action"}
									]
						},
						{"menuid":"14","icon":"icon-sys","menuname":"附件管理",
							"menus":[
								    {"menuid":"111","menuname":"附件管理","icon":"icon-nav","url":"attachment_manage"}
									]
						}
						
				]};
	 
//初始化左侧
function InitLeftMenu() {
	$("#nav").accordion({animate:false});
    $.each(_menus.menus, function(i, n) {
		var menulist ='';
		menulist +='<ul>';
        $.each(n.menus, function(j, o) {
			menulist += '<li><div><a ref="'+o.menuid+'" href="javascript:void(0);" rel="' + o.url + '" ><span class="icon '+o.icon+'" >&nbsp;</span><span class="nav">' + o.menuname + '</span></a></div></li> ';
        })
		menulist += '</ul>';
		$('#nav').accordion('add', {
            title: n.menuname,
            content: menulist,
            iconCls: 'icon ' + n.icon
        });

    });

	$('.easyui-accordion li a').click(function(){
		var tabTitle = $(this).children('.nav').text();
        var url = $(this).attr("rel");
		var menuid = $(this).attr("ref");
		var icon = getIcon(menuid,icon);
        addTab(tabTitle,url,icon);
		$('.easyui-accordion li div').removeClass("selected");
		$(this).parent().addClass("selected");
	}).hover(function(){
		$(this).parent().addClass("hover");
	},function(){
		$(this).parent().removeClass("hover");
	});

	//选中第一个
	var panels = $('#nav').accordion('panels');
	var t = panels[0].panel('options').title;
    $('#nav').accordion('select', t);
}
//获取左侧导航的图标
function getIcon(menuid){
	var icon = 'icon ';
	$.each(_menus.menus, function(i, n) {
		 $.each(n.menus, function(j, o) {
		 	if(o.menuid==menuid){
				icon += o.icon;
			}
		 })
	})

	return icon;
}

function addTab(subtitle,url,icon){
	if(!$('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('add',{
			title:subtitle,
			content:createFrame(url),
			closable:true,
			icon:icon
		});
	}else{
		$('#tabs').tabs('select',subtitle);
		$('#mm-tabupdate').click();
	}
	tabClose();
}

function createFrame(url)
{
	var s = '<iframe class="operator_iframe" scrolling="auto" frameborder="0"  src="'+url+'" width="100%" height="100%" ></iframe>';
	return s;
}

function tabClose()
{
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children(".tabs-closable").text();
		$('#tabs').tabs('close',subtitle);
	})
	/*为选项卡绑定右键*/
	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY
		});

		var subtitle =$(this).children(".tabs-closable").text();

		$('#mm').data("currtab",subtitle);
		$('#tabs').tabs('select',subtitle);
		return false;
	});
}
//绑定右键菜单事件
function tabCloseEven()
{
	//刷新
	$('#mm-tabupdate').click(function(){
		var currTab = $('#tabs').tabs('getSelected');
		var url = $(currTab.panel('options').content).attr('src');
		$('#tabs').tabs('update',{
			tab:currTab,
			options:{
				content:createFrame(url)
			}
		})
	})
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	})
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			$('#tabs').tabs('close',t);
		});
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		$('#mm-tabcloseright').click();
		$('#mm-tabcloseleft').click();
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});

	//取消
	$("#mm-exit").click(function(){
		$('#mm').menu('hide');
	})
}
function resize(){
	$(".operator_iframe").height(this.document.body.clientHeight-80);
}
function changeUrl(){
		 choice=$("#course_select").val();
		 if(choice>0){
		 url="../index.php?r=index/index&course_id="+choice;
		 window.open(url,"newwindow");
	 }	
	}

