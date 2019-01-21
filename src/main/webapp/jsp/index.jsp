<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>公司车辆管理系统</title>
		<meta charset="utf-8">
		<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
		<link rel="stylesheet" href="${path}/assets/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
		<link rel="stylesheet" href="${path}/assets/css/ready.css">
		<link rel="stylesheet" href="${path}/assets/css/demo.css">
	</head>

	<body>
		
		<div class="wrapper">
			
			
			<!--以下是导航栏-->
			<div class="main-header">
				<div class="logo-header">
					<a href="index.jsp" class="logo">
						公司车辆信息管理
					</a>
					<button class="navbar-toggler sidenav-toggler ml-auto" type="button" data-toggle="collapse" data-target="collapse" aria-controls="sidebar" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
					<button class="topbar-toggler more"><i class="la la-search search-icon"></i></button>
				</div>
				<nav class="navbar navbar-header navbar-expand-lg">
					<div class="container-fluid">

						
						<ul class="navbar-nav topbar-nav ml-md-auto align-items-center">

							<li class="nav-item dropdown">
								<a class="dropdown-toggle profile-pic" data-toggle="dropdown" href="#" aria-expanded="false"> <img src="${path}/assets/img/profile.jpg" alt="user-img" width="36" class="img-circle"><span>管理员1</span></span>
								</a>
									<ul class="dropdown-menu dropdown-user">
									<li>
										<div class="user-box">
											<div class="u-img"><img src="${path}/assets/img/profile.jpg" alt="user"></div>
											<div class="u-text">
												<h4>管理员1</h4>
												<p class="text-muted">913473646@qq.com</p>
											</div>
									</li>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="#"><i class="ti-user"></i>查看上次登陆信息</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="#"><i class="fa fa-power-off"></i> 注销</a>
								</ul>
								<!-- /.dropdown-user -->
							</li>
						</ul>
						</div>
				</nav>
				</div>
				<!--导航栏结束-->
				
				<!--以下是左侧导航栏-->
				<div class="sidebar">
					<div class="scrollbar-inner sidebar-wrapper">
						<div class="user">
							<div class="photo">
								<img src="${path}/assets/img/profile.jpg">
							</div>
							<div class="info">
								<a class="" data-toggle="collapse" href="#collapseExample" aria-expanded="true">
									<span>
									管理员1
									<span class="user-level">Admin</span>
									<span class="caret"></span>
									</span>
								</a>
								<div class="clearfix"></div>

								<div class="collapse in" id="collapseExample" aria-expanded="true" style="">
									<ul class="nav">
										<li>
											<a href="#profile">
												<span class="link-collapse">查看上次登陆信息</span>
											</a>
										</li>
							
									</ul>
								</div>
							</div>
						</div>
						<ul class="nav">
							<li class="nav-item active">
								<a href="${path}/jsp/index.jsp">
									<i class="la la-dashboard"></i>
									<p>首页</p>
								</a>
							</li>
							<li class="nav-item">
								<a href="${path}/jsp/free_car.jsp">
									<i class="la la-cab"></i>
									<p>查看空闲车辆</p>
										<span class="badge badge-success">3</span>
								</a>
							</li>
							<li class="nav-item">
								<a href="${path}/jsp/running_car.jsp">
									<i class="la la-keyboard-o"></i>
									<p>查看已出车辆</p>

								</a>
							</li>
							<li class="nav-item">
								<a href="${path}/jsp/fix_car.jsp">
									<i class="la la-cogs"></i>
									<p>待修理/加油车辆</p>
									<span class="badge badge-danger">25</span>
								</a>
							</li>
							<li class="nav-item">
								<a href="${path}/jsp/car_resiger.jsp">
									<i class="la la-key"></i>
									<p>车辆注册</p>
								
								</a>
							</li>
							<li class="nav-item">
								<a href="${path}/jsp/peo_resiger.jsp">
									<i class="la la-group"></i>
									<p>驾驶员注册</p>
								
								</a>
							</li>
							<li class="nav-item update-pro">
								<button data-toggle="modal" data-target="#modalUpdate">
								<i class="la la-hand-pointer-o"></i>
								<p>退出登录</p>
							</button>
							</li>
						</ul>
					</div>
				</div>
			<!--左侧导航栏结束-->
				
				
			<!--以下是内容栏-->
				<div class="main-panel">
					<div class="content">
						<div class="row row-card-no-pd">
							<div class="col-md-4">
								<div class="card">
									<div class="card-body">
										
										<p class="fw-bold mt-1">今日出车数量</p>
										<h4><b>4015次</b></h4>
									</div>
									<div class="card-footer">
										<ul class="nav">
											
											<li class="nav-item ml-auto"><a class="btn btn-default btn-link" href="#"><i class="la la-refresh"></i> Refresh</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="col-md-5">
								<div class="card">
									<div class="card-body">
										<div class="progress-card">
											<div class="d-flex justify-content-between mb-1">
												<span class="text-muted">空闲车辆</span>
												<span class="text-muted fw-bold"> 58台</span>
											</div>
											<div class="progress mb-2" style="height: 7px;">
												<div class="progress-bar bg-success" role="progressbar" style="width: 78%" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" data-toggle="tooltip" data-placement="top" title="78%"></div>
											</div>
										</div>
										<div class="progress-card">
											<div class="d-flex justify-content-between mb-1">
												<span class="text-muted">正在使用车辆</span>
												<span class="text-muted fw-bold"> 20台</span>
											</div>
											<div class="progress mb-2" style="height: 7px;">
												<div class="progress-bar bg-info" role="progressbar" style="width: 22%" aria-valuenow="22" aria-valuemin="0" aria-valuemax="100" data-toggle="tooltip" data-placement="top" title="65%"></div>
											</div>
										</div>
										<div class="progress-card">
											<div class="d-flex justify-content-between mb-1">
												<span class="text-muted">空闲驾驶员</span>
												<span class="text-muted fw-bold"> 28人</span>
											</div>
											<div class="progress mb-2" style="height: 7px;">
												<div class="progress-bar bg-primary" role="progressbar" style="width: 56%" aria-valuenow="56" aria-valuemin="0" aria-valuemax="100" data-toggle="tooltip" data-placement="top" title="70%"></div>
											</div>
										</div>
										<div class="progress-card">
											<div class="d-flex justify-content-between mb-1">
												<span class="text-muted">执行任务驾驶员</span>
												<span class="text-muted fw-bold"> 20人</span>
											</div>
											<div class="progress mb-2" style="height: 7px;">
												<div class="progress-bar bg-warning" role="progressbar" style="width: 44%" aria-valuenow="44" aria-valuemin="0" aria-valuemax="100" data-toggle="tooltip" data-placement="top" title="60%"></div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="card card-stats">
									<div class="card-body">
										<p class="fw-bold mt-1">排行榜</p>
										
										<div class="row">
											<div class="col-5">
												<div class="icon-big text-center">
													<i class="la la-heart-o text-primary"></i>
												</div>
											</div>
											<div class="col-7 d-flex align-items-center">
												<div class="numbers">
													<p class="card-category">今日最佳驾驶员</p>
													<h4 class="card-title">aaa</h4>
												</div>
											</div>
											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<footer class="footer">
				<div class="container-fluid">

					<div align="center">
						版权所有：张博文小组
					</div>
			</footer>
			</div>
		</div>
		</div>

	</body>
	<script src="${path}/assets/js/core/jquery.3.2.1.min.js"></script>
	<script src="${path}/assets/js/core/bootstrap.min.js"></script>
	<script src="${path}/assets/js/ready.min.js"></script>
	<script src="${path}/assets/js/demo.js"></script>

</html>
<!--
	int shu[]=db.select("car","state=runing")
	int shu2[]=db.select("run_car","id=shu['id']")
	
	
	
-->