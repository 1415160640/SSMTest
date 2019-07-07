<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css" />
    <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">-->
    <link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet" type="text/css">
<title>移动办公自动化系统</title>
</head>

<body>
<div class="article toolbar">
	<div class="title ue-clear">
    	<h2>常用功能</h2>
        <!--<a href="javascript:;" class="more">更多</a>-->
    </div>
    <div class="content">
    	<ul class="toollist ue-clear">
    	    <c:if test="${Admin.state == 1}">
    	    <li>
            	<a href="${pageContext.request.contextPath}/findCate" class="img" target="right"><img src="${pageContext.request.contextPath}/images/file03.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findCate" target="right">岗位设置</a></p>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/findAllowance" class="img" target="right"><img src="${pageContext.request.contextPath}/images/icon07.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findAllowance" target="right">津贴设置</a></p>
            </li>
            <li>
            	<a href="${pageContext.request.contextPath}/findWorkday" class="img" target="right"><img src="${pageContext.request.contextPath}/images/icon04.png"/></a>
                <p><a href="${pageContext.request.contextPath}/findWorkday" onclick="openlayer()">在岗考勤</a></p>
            </li>
    	    <li>
            	<a href="${pageContext.request.contextPath}/findWorktime" class="img"><img src="${pageContext.request.contextPath}/images/leave01.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findWorktime">课时登记</a></p>
            </li>
             <li>
            	<a href="${pageContext.request.contextPath}/findSpring" class="img" target="right"><img src="${pageContext.request.contextPath}/admin/images/datecion01.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findSpring" target="right">津贴登记</a></p>
            </li>
            <li>
            	<a href="${pageContext.request.contextPath}/findUser" class="img" target="right"><img src="${pageContext.request.contextPath}/images/icon02.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findUser" target="right">职工信息</a></p>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/findMoney" class="img" target="right"><img src="${pageContext.request.contextPath}/images/myFiles.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findMoney" target="right">工资管理</a></p>
            </li>
            <li>
            	<a href="${pageContext.request.contextPath}/findOldMoney" class="img" target="right"><img src="${pageContext.request.contextPath}/images/icon04.png"/></a>
                <p><a href="${pageContext.request.contextPath}/findOldMoney" onclick="openlayer()">往期工资</a></p>
            </li>
            </c:if>
            
            <c:if test="${Admin.state != 1}">
            <li>
            	<a href="${pageContext.request.contextPath}/myUser" class="img" target="right"><img src="${pageContext.request.contextPath}/images/file02.png" /></a>
                <p><a href="${pageContext.request.contextPath}/myUser" target="right">我的信息</a></p>
            </li>
            <li>
            	<a href="${pageContext.request.contextPath}/findMoney?newuser=${Admin.id}" class="img" target="right"><img src="${pageContext.request.contextPath}/images/icon01.png" /></a>
                <p><a href="${pageContext.request.contextPath}/findMoney?newuser=${Admin.id}" target="right">我的工资</a></p>
            </li>
            </c:if>
           
            
         
           
            <li>
            	<a href="#" class="img" target="right"><img src="${pageContext.request.contextPath}/images/posintion01.png" /></a>
                <p><a href="#" target="right">资料管理</a></p>
            </li>
            <li class="add-btn">
            	<img src="${pageContext.request.contextPath}/images/add.png" />
            </li>
    	</ul>
        
    </div>
</div>
<div class="article half email">
	<div class="wrap-l">
        <div class="title ue-clear">
            <h2>通知</h2>
            <a href="#" class="more" target="right">更多</a>
        </div>
        <div class="content">
            <table class="table" id="tbRecord">
					<thead>
					<tr >
					<th width="200">标题</th>
					<th>内容</th>
					<th>详情</th>
				    </tr>
					</thead>
					<tbody>
				    <tr class="text-c">
					    <td>五一劳动节放假安排</td>
					    <td class="text-l">劳动节放假注意事项，各班主任需要.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>	
					<tr class="text-c">
					    <td>四级考试安排</td>
					    <td class="text-l">英语四级考试马上到来，各班主任要.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>
					  <tr class="text-c">
					    <td>学生管理条例</td>
					    <td class="text-l">在校学生应当遵守的行为规范.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>	
					<tr class="text-c">
					    <td>教师教学规范</td>
					    <td class="text-l">授课教师在教学过程中需要注意的事项.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>			
					</tbody>		
		</table>
        </div>
    </div>
</div>
<div class="article half email">
	<div class="wrap-l">
         <div class="title ue-clear">
            <h2>公告</h2>
            <a href="#" class="more" target="right">更多</a>
        </div>
        <div class="content">
           <table class="table" id="tbRecord">
					<thead>
					<tr >
					<th width="200">标题</th>
					<th>内容</th>
					<th>详情</th>
				    </tr>
					</thead>
					<tbody>
				    <tr class="text-c">
					    <td>学生管理条例</td>
					    <td class="text-l">在校学生应当遵守的行为规范.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>	
					<tr class="text-c">
					    <td>教师教学规范</td>
					    <td class="text-l">授课教师在教学过程中需要注意的事项.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>
					 <tr class="text-c">
					    <td>五一劳动节放假安排</td>
					    <td class="text-l">劳动节放假注意事项，各班主任需要.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>	
					<tr class="text-c">
					    <td>四级考试安排</td>
					    <td class="text-l">英语四级考试马上到来，各班主任要.......</td>
					    <td><a href="#" class="label label-success radius" style="color:green;">详情</a></td>
					</tr>					
					</tbody>								
		  </table>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">
$(".title-list ul").on("click","li",function(){
	var aIndex = $(this).index();
	$(this).addClass("current").siblings().removeClass("current");
	$(".matter-content").removeClass("current").eq(aIndex).addClass("current");
});

$(".duty").find("tbody").find("tr:even").css("backgroundColor","#eff6fa");
</script>
<script src="js/layer_v2.1/layer/layer.js"></script>
</html>
