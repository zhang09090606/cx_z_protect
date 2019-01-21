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
	<link rel="stylesheet" href="${path}/assets/css/fileinput.min.css" />
</head>

<body>

<div class="wrapper">

	<!--以下是导航栏-->
	<div class="main-header">
		<div class="logo-header">
			<a href="#" class="logo">
				车辆注册
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
				<li class="nav-item ">
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
				<li class="nav-item active">
					<a href=" ${path}/jsp/car_resiger.jsp">
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
	<div class="main-panel" >
		<div class="content">
			<div class="container-fluid">

				<div class="col-md-12">
					<div class="card card-stats">
						<div class="card-body ">
							<div class="row">

								<div class="col-12 d-flex">
									<div class="numbers ">
										<h4 class="card-title">&nbsp;&nbsp;请填写您要注册的车辆信息</h4>
										</br>
										<div class="container-fluid">
											<div class="row">
												<!--表单开始-->
												<form role="form">
													<div class="form-group">
														<label for="name">车辆名称:</label>
														<input type="text" class="form-control" name="carname" id="name" placeholder="请输入您要注册的车辆名称" style="width: 100%;">
													</div>
													<div class="form-group">
														<label for="card">车牌号码:</label>
														<input type="text" class="form-control " name="carcard" id="card" placeholder="请输入您要注册的车牌号码">
													</div>

													<div class="form-group">
														<label for="uploadFile">车辆图片：</label></br>
														<input style="width: 50px;" name="pic" type="file" id="uploadFile" data-show-preview="false" data-allowed-file-extensions='["jpg","png"]' />
													</div>
													</br>
													&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-success">提交</button>
												</form>

												<!--表单结束-->

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
	</div>
</div>
<footer class="footer">
	<div class="container-fluid">

		<div align="center">
			版权所有：张博文
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
<script src="${path}/assets/js/fileinput.min.js"></script>
<script src="${path}/assets/js/zh.js"></script>
<script>
    initFileInput();
    function initFileInput() {
        $("#uploadFile").fileinput({
            language: 'zh'
        })
    }
</script>

</html>