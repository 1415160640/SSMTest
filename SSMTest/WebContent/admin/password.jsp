<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/vector.js"></script>
</head>
<body style="background-color: #257FCB;bottom-top: 20%;">
<div id="container" style="bottom-top: 20%;">
    <div id="output">
      <div class="containerT">
            <form action="${pageContext.request.contextPath}/updatePass" method="post" target="_parent" >
								<br/><br/><br/><br/><br/>
							    <input type="password" id="entry_password" required  placeholder="新密码" name="password" />
								<button type="submit" id="entry_btn" >修改</button>
								
           </form>
      </div>
     </div>
     </div>
</body>
</html>