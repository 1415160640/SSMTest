<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itcast.cn/common/"%>
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

<title>职工管理</title>

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
					<h1 class="page-header">职工信息</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" action="${pageContext.request.contextPath }/findUser" method="post">
						<div class="form-group">
							<label for="customerName">职工姓名：</label>
							<input type="text" class="form-control" id="customerName" value="${NewName}" name="newname">
						</div>&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="form-group">
							<label for="customerFrom">岗位：</label>
							<select	class="form-control" id="customerFrom" placeholder="客户来源" name="newcate">
								<option value="">--请选择--</option>
								<c:forEach items="${Cate}" var="item">
									<option value="${item.id}"<c:if test="${item.id == NewCate}"> selected</c:if>>${item.name }</option>
								</c:forEach>
							</select>
						</div>
						&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">查询</button>
						<a href="<%=basePath%>addUserUI" class="btn btn-primary" style="background-color: red; display:inline-block;float:right;">添加</a>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">职工信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th width="120px">职工姓名</th>
									<th width="150px">账号</th>
									<th width="150px">岗位</th>
									<th width="200px">籍贯</th>
									<th>手机</th>
									<th>身份证号码</th>
									<th >操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.id}</td>
										<td>${row.name}</td>
										<td>${row.username}</td>
										<td>
										<c:forEach items="${Cate}" var="p">
										       <c:if test="${p.id == row.state}">${p.name}</c:if>
										</c:forEach>
										</td>
										<td>${row.address}</td>
										<td>${row.phone}</td>
										<td>${row.pid}</td>
										<td>
											&nbsp;<a href="<%=basePath%>editUser?id=${row.id}" class="btn btn-primary btn-xs" >修改</a>
											&nbsp;&nbsp;&nbsp;<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.id})">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
					            	<itheima:page url="${pageContext.request.contextPath }/findUser" />
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
			if(confirm('确实要删除该职工信息吗?')) {
				$.post("<%=basePath%>deleteUser",{"id":id},function(data){
					alert("职工信息删除成功！");
					window.location.reload();
				});
			}
		}
	</script>

</body>

</html>
