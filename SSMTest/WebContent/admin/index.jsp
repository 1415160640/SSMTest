<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery.dialog.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css" />
    <style>
        .layui-layer-title{background:url(${pageContext.request.contextPath}/images/righttitlebig.png) repeat-x;font-weight:bold;color:#46647e; border:1px solid #c1d3de;height: 33px;line-height: 33px;}
    </style>
<title>怀化特殊教育学校工资管理系统</title>
</head>
<body>
<c:if test="${sessionScope.Admin == null }">
		<%response.sendRedirect("../index.jsp"); %>
</c:if>
<div id="container">
	<div id="hd">
    	<div class="hd-wrap ue-clear">
        	<div class="top-light"></div>
            <div class="login-info ue-clear">
                <div class="welcome ue-clear"><span>欢迎您,</span>${Admin.name}</div>
            </div>
            <div class="toolbar ue-clear">
                <a href="${pageContext.request.contextPath}/startHome" class="home-btn" target="right">首页</a>
                <a href="javascript:void(0)" class="home-btn1" target="right" onclick="openlayer()">修改密码</a>
                <a href="javascript:void(0)" class="quit-btn exit home-btn">退出</a>
            </div>
        </div>
    </div>
    <div id="bd">
    	<div class="wrap ue-clear">
        	<div class="sidebar">
            	<h2 class="sidebar-header"><p>功能导航</p></h2>
                <ul class="nav">
                	<li class="office current"><div class="nav-header"><a href="${pageContext.request.contextPath}/startHome" target="right" class="ue-clear"><span>首页</span><i class="icon"></i></a></div></li>
                     <c:if test="${Admin.state == 1}">
                    <li class="land"><div class="nav-header"><a href="JavaScript:;" class="ue-clear" ><span>基础设置</span><i class="icon hasChild"></i></a></div>
                        <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/findCate" target="right">岗位设置</a></li>
                            <li><a href="${pageContext.request.contextPath}/findAllowance" target="right">津贴设置</a></li>
                        </ul>
                    </li>
                    <li class="train"><div class="nav-header"><a href="JavaScript:;" class="ue-clear" ><span>考勤管理</span><i class="icon hasChild"></i></a></div>
                        <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/findWorkday" target="right">在岗考勤</a></li>
                            <li><a href="${pageContext.request.contextPath}/findWorktime" target="right">课时登记</a></li>
                            <li><a href="${pageContext.request.contextPath}/findSpring" target="right">津贴登记</a></li>
                        </ul>
                    </li>
                    <li class="news_m"><div class="nav-header"><a href="JavaScript:;" class="ue-clear"  target="right"><span>财务管理</span><i class="icon"></i></a></div>
                         <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/findMoney" target="right">工资管理</a></li>
                            <li><a href="${pageContext.request.contextPath}/findOldMoney" target="right">往期工资</a></li>
                        </ul>
                    </li>
                    <li class="dossier"><div class="nav-header"><a href="JavaScript:;" class="ue-clear" ><span>人员管理</span><i class="icon hasChild"></i></a></div>
                         <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/findUser" target="right">职工信息</a></li>
                        </ul>
                    </li>
                    </c:if>
                    
                    <c:if test="${Admin.state != 1}">
                    <li class="list_m"><div class="nav-header"><a href="JavaScript:;" class="ue-clear" target="right"><span>个人中心</span><i class="icon"></i></a></div>
                        <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/myUser" target="right">我的信息</a></li>
                        </ul>
                    </li>
                    <li class="part"><div class="nav-header"><a href="JavaScript:;" class="ue-clear" ><span>工资管理</span><i class="icon hasChild"></i></a></div>
                        <ul class="subnav">
                            <li><a href="${pageContext.request.contextPath}/findMoney?newuser=${Admin.id}" target="right">我的工资</a></li>
                        </ul>
                    </li>
                   </c:if>
                    
                    
                </ul>
            </div>
            <div class="content">
            	<iframe src="${pageContext.request.contextPath}/admin/home.jsp" id="iframe" width="100%" height="100%" frameborder="0" name="right" style="min-width: 1100px"></iframe>
            </div>
        </div>
    </div>
    <div id="ft" class="foot_div">
            <span>怀化特殊教育学校工资管理系统</span>
    </div>
</div>
<div class="exitDialog">
	<div class="dialog-content">
    	<div class="ui-dialog-icon"></div>
        <div class="ui-dialog-text">
        	<p class="dialog-content">你确定要退出系统？</p>
            <p class="tips">如果是请点击“确定”，否则点“取消”</p>
            <div class="buttons">
                <input type="button" class="button long2 ok" value="确定" />
                <input type="button" class="button long2 normal" value="取消" />
            </div>
        </div>
        
    </div>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/core.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dialog.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
<script src="${pageContext.request.contextPath}/js/layer_v2.1/layer/layer.js"></script>
<script type="text/javascript">
    function openlayer(id){
        layer.open({
            type: 2,
            title: '修改密码',
            shadeClose: false,
            shade: 0.5,
            skin: 'layui-layer-rim',
            maxmin: true,
            closeBtn:2,
            area: ['35%', '40%'],
            content: '/SSMTest/admin/password.jsp'
            //iframe的url
        });
    }
</script>
</html>
