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

<title>未结算工资</title>

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
					<h1 class="page-header">未结算工资</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
				<c:if test="${Admin.state == 1 }" >
					<form class="form-inline" action="${pageContext.request.contextPath }/findMoney" method="post">
						<div class="form-group">
							<label for="customerFrom">职工姓名：</label>
								<input type="text" class="form-control" id="customerName" value="${NewName}" name="newname">
						</div>&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
				</c:if>
				<c:if test="${Admin.state != 1}">
				  1.查看本人往期工资情况<br/>
				  2.对考勤或工资存在异议<br/>
				    请与系统管理员联系
				</c:if>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">未结算工资列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th width="80px">用户ID</th>
									<th width="120px">用户名</th>
									<th width="120px">用户账号</th>
									<th width="290px">基本工资（元）</th>
									<th width="290px">课时工资（元）</th>
									<th width="120px">应发工资（元）</th>
									<th width="280px">津贴扣费详情</th>
									<th width="140px">抵扣总金额（元）</th>
									<th width="120px">实发工资（元）</th>
									<c:if test="${Admin.state == 1}">
									<th>操作</th>
									</c:if>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">
									<tr>
										<td>${row.user.id}</td>
										<td>${row.user.name}</td>
										<td>${row.user.username}</td>
										<td>工作天数（${row.day.total}）*工资（${row.daymoney}）=${row.daymoney*row.day.total}</td>
										<td>课时数（${row.worktime.total}）*课时费（${row.worktimemoney}）=${row.worktimemoney*row.worktime.total}</td>
										<td>${row.yingfa}</td>
										<td>
										    <c:if test="${not empty row.spring1 }" >
										       <c:forEach items="${row.spring1}" var="p">
										             项目：${p.allowance.name}&nbsp;金额：${p.allowance.money}<br />
										       </c:forEach>
										    </c:if>
										       <c:if test="${empty row.spring1 }" >
										               无相关数据
										        </c:if>
										    
										</td>
										<td>${row.springmoney}</td>
										<td>${row.shifa}</td>
										<c:if test="${Admin.state == 1}">
										<td>								   
											&nbsp;&nbsp;&nbsp;
											<c:if test="${row.shifa != 0}" >
											<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.user.id})">结算</a>
											</c:if>
											<c:if test="${row.shifa == 0}" >
                                                    <div class="btn btn-primary btn-xs">已结清</div>
                                            </c:if>
										</td>
										</c:if>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
						            <c:if test="${Admin.state == 1}">
					            	<itheima:page url="${pageContext.request.contextPath }/findMoney" />
					            	</c:if>
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
			if(confirm('确实要结算该职工的工资吗?')) {
				$.post("<%=basePath%>addOldMoney",{"id":id},function(data){
					alert("结算成功！");
					window.location.reload();
				});
			}
		}
	</script>
</body>

</html>
