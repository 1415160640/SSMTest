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
	<!-- 编辑对话框 -->
	<div  >
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">修改职工信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_customer_form">
						<input type="hidden" id="edit_cust_id" name="id"  value="${user.id }"/>
						<div class="form-group">
							<label for="edit_customerName" class="col-sm-2 control-label">职工姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_customerName" value="${user.name}" name="name">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_customerFrom" class="col-sm-2 control-label">账号</label> 
								<div class="col-sm-10">
							 <input type="text" class="form-control" id="edit_customerName" value="${user.username}" name="username">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_custIndustry" class="col-sm-2 control-label">密码</label>
						    <div class="col-sm-10">
							<input type="text" class="form-control" id="edit_customerName" value="${user.password}" name="password">
							</div>
						</div>
						<c:if test="${Admin.state == 1 }">
						<div class="form-group">
							<label for="edit_custLevel" class="col-sm-2 control-label">岗位</label>
							<div class="col-sm-10">
								<select	class="form-control" id="edit_custLevel" name="state">
									<option value="">--请选择--</option>
									<c:forEach items="${Cate}" var="item">
										<option value="${item.id}"<c:if test="${item.id == user.state}"> selected</c:if>>${item.name }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						</c:if>
						<c:if test="${Admin.state != 1 }">
						<div class="form-group">
						      <input type="hidden" id="edit_cust_id" name="state"  value="${user.state }"/>
						      <label for="edit_custLevel" class="col-sm-2 control-label">岗位</label>
							  <div class="col-sm-10">
							       <c:forEach items="${Cate}" var="item">
										<c:if test="${item.id == user.state}"><input type="text"  disabled="disabled" class="form-control" id="edit_customerName" value=" ${item.name }" /></c:if>
									</c:forEach>
							  </div>
						</div>
						</c:if>
						<div class="form-group">
							<label for="edit_linkMan" class="col-sm-2 control-label">籍贯</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_linkMan" value="${user.address}" name="address">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_phone" class="col-sm-2 control-label">电话</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_phone" value="${user.phone}" name="phone">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_mobile" class="col-sm-2 control-label">身份证号</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_mobile" value="${user.pid}" name="pid">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" onclick="updateCustomer()">保存修改</button>
				</div>
			</div>
		</div>
	</div>
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
		function updateCustomer() {
			$.post("<%=basePath%>updateUser",$("#edit_customer_form").serialize(),function(data){
				alert("修改职工信息成功！");
				window.location.reload();
			});
		}
	</script>

</body>

</html>
