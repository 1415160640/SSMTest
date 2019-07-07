<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itcast.cn/common/"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>工资结算记录</title>

<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">

<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	
		<div>
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">工资结算记录</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/findOldMoney" method="post">
						<div class="form-group">
							<label for="customerFrom">职工账号：</label>
							<select	class="form-control" id="customerFrom"  name="newuser">
								<option value="">--请选择--</option>
								<c:forEach items="${Users}" var="item">
									<option value="${item.id}"<c:if test="${item.id == NewUser}"> selected</c:if>>${item.username}</option>
								</c:forEach>
							</select>
						   </div>&nbsp;&nbsp;&nbsp;
						   <div class="form-group">
							<label for="customerFrom">年份：</label>
							<select	class="form-control" id="customerFrom"  name="newyear">
								    <option value="">--请选择--</option>
								    <option value="2019"<c:if test="${2019 == NewYear}"> selected</c:if>>2019</option>
									<option value="2018"<c:if test="${2018 == NewYear}"> selected</c:if>>2018</option>
									<option value="2017"<c:if test="${2017 == NewYear}"> selected</c:if>>2017</option>
									<option value="2016"<c:if test="${2016 == NewYear}"> selected</c:if>>2016</option>
								    <option value="2015"<c:if test="${2015 == NewYear}"> selected</c:if>>2015</option>
									<option value="2014"<c:if test="${2014 == NewYear}"> selected</c:if>>2014</option>
							</select>
						   </div>&nbsp;&nbsp;&nbsp;
						   <div class="form-group">
							<label for="customerFrom">月份：</label>
							<select	class="form-control" id="customerFrom" name="newmonth">
								<option value="">--请选择--</option>
								    <option value="12"<c:if test="${12 == NewMonth}"> selected</c:if>>12</option>
									<option value="11"<c:if test="${11 == NewMonth}"> selected</c:if>>11</option>
									<option value="10"<c:if test="${10 == NewMonth}"> selected</c:if>>10</option>
									<option value="9"<c:if test="${9 == NewMonth}"> selected</c:if>>9</option>
								    <option value="8"<c:if test="${8 == NewMonth}"> selected</c:if>>8</option>
									<option value="7"<c:if test="${7 == NewMonth}"> selected</c:if>>7</option>
									<option value="6"<c:if test="${6 == NewMonth}"> selected</c:if>>6</option>
									<option value="5"<c:if test="${5 == NewMonth}"> selected</c:if>>5</option>
									<option value="4"<c:if test="${4 == NewMonth}"> selected</c:if>>4</option>
									<option value="3"<c:if test="${3 == NewMonth}"> selected</c:if>>3</option>
								    <option value="2"<c:if test="${2 == NewMonth}"> selected</c:if>>2</option>
									<option value="1"<c:if test="${1 == NewMonth}"> selected</c:if>>1</option>
							</select>
						   </div>&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">工资结算记录列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th width="80px">ID</th>
									<th width="120px">用户名</th>
									<th width="120px">用户账号</th>
									<th width="200px">结算日期</th>
									<th width="290px">基本工资（元）</th>
									<th width="290px">课时工资（元）</th>
									<th width="120px">应发工资（元）</th>
									<th width="120px">津贴扣费（项）</th>
									<th width="140px">抵扣总金额（元）</th>
									<th width="120px">实发工资（元）</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.id}</td>
										<td>${row.user.name}</td>
										<td>${row.user.username}</td>
										<td><fmt:formatDate value="${row.date}"  pattern="yyyy-MM-dd"/></td>
										<td>工作天数（${row.day}）*工资（${row.daymoney}）=${row.daymoney*row.day}</td>
										<td>课时数（${row.worktime}）*课时费（${row.worktimemoney}）=${row.worktimemoney*row.worktime}</td>
										<td>${row.yingfa}</td>
										<td>${row.spring}</td>
										<td>${row.springmoney}</td>
										<td>${row.shifa}</td>
										<td>								   
											&nbsp;&nbsp;&nbsp;
											<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.id})">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
					            	<itheima:page url="${pageContext.request.contextPath }/findOldMoney" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->

	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	
	<script type="text/javascript">
		function deleteCustomer(id) {
			if(confirm('确实要删除该信息吗?')) {
				$.post("<%=basePath%>deleteOldMoney",{"id":id},function(data){
					alert("信息删除成功！");
					window.location.reload();
				});
			}
		}
	</script>
</body>

</html>
