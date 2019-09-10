<%@ page language="java" import="java.util.*,com.cjlu.pojo.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
	$("#out").click(function(){
		
		var flag=window.confirm("你真的要退出吗");
		if(flag){
			window.top.location.href="index.jsp";
		}
	})
})	
</script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

      
    <div class="topright">    
    <div class="user">
    欢迎登入飞机售票管理系统，<span>${buyuser.username}</span>
    </div>
    <ul>
    <li><a href="javascrip:void(0)" id="out">退出</a></li>
    </ul>    
    </div>

</body>
</html>
    