<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>怀化特殊教育学校工资管理系统</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/vector.js"></script>

</head>
<body>

<div id="container">
	<div id="output">
		<div class="containerT">
			<h1 style="font-size:2.0em">怀化市特殊教育学校工资管理系统</h1>
			<div style=" color:red;"><h1>${msg}</h1></div>
			<form class="form"  action="${pageContext.request.contextPath}/teacherlogin" method="post" id="adminLogin">
				<input type="text" placeholder="用户名" id="entry_name" name="username">
				<input type="password" placeholder="密码" id="entry_password"  name="password">
				<button id="entry_btn" type="submit">登录</button>
				<div id="prompt" class="prompt"></div>
			</form>
		</div>
	</div>
</div>

<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登录背景函数
        $("#entry_name").focus();
        $(document).keydown(function(event){
            if(event.keyCode==13){
                $("#entry_btn").click();
            }
        });
    });
</script>
<script src="${path}/js/login.js"></script>
</body>
</html>