/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-21 12:44:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fix_005fcar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\t\t<title>公司车辆管理系统</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/ready.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/demo.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--以下是导航栏-->\r\n");
      out.write("\t\t\t<div class=\"main-header\">\r\n");
      out.write("\t\t\t\t<div class=\"logo-header\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\" class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t公司车辆信息管理\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<button class=\"navbar-toggler sidenav-toggler ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"collapse\" aria-controls=\"sidebar\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"topbar-toggler more\"><i class=\"la la-search search-icon\"></i></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-header navbar-expand-lg\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navbar-nav topbar-nav ml-md-auto align-items-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"dropdown-toggle profile-pic\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\"> <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/profile.jpg\" alt=\"user-img\" width=\"36\" class=\"img-circle\"><span>管理员1</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"user-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"u-img\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/profile.jpg\" alt=\"user\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"u-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>管理员1</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p class=\"text-muted\">913473646@qq.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"><i class=\"ti-user\"></i>查看上次登陆信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-power-off\"></i> 注销</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- /.dropdown-user -->\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--导航栏结束-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!--以下是左侧导航栏-->\r\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"scrollbar-inner sidebar-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"user\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/profile.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"\" data-toggle=\"collapse\" href=\"#collapseExample\" aria-expanded=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t管理员1\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"user-level\">Admin</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"collapse in\" id=\"collapseExample\" aria-expanded=\"true\" style=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#profile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"link-collapse\">查看上次登陆信息</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-dashboard\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>首页</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"free_car.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-cab\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>查看空闲车辆</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"badge badge-success\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"running_car.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-keyboard-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>查看已出车辆</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"fix_car.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-cogs\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>待修理/加油车辆</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"badge badge-danger\">25</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"car_resiger.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-key\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>车辆注册</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"peo_resiger.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"la la-group\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>驾驶员注册</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item update-pro\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button data-toggle=\"modal\" data-target=\"#modalUpdate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"la la-hand-pointer-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>退出登录</p>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<!--左侧导航栏结束-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<!--以下是内容栏-->\r\n");
      out.write("\t\t\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-stats\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"numbers text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" width=\"100%\" style=\"float:left;margin-left20px;max-width: 300px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/10.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div  style=\"float:left;height:200px;text-align:left; padding-left:30px;padding-top: 20px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆编号：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆信息：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆状态：xx\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"64px;padding-top: 34px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">解除异常状态</button>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-danger\">报废</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-stats\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 d-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"numbers text-center .col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" width=\"100%\" style=\"float:left;margin-left:20px;max-width: 300px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/20.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div  style=\"height:200px;text-align:left;float: left; padding-left:30px;padding-top: 20px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆编号：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆信息：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆状态：xx\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"64px;padding-top: 34px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">解除异常状态</button>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-danger\">报废</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card card-stats\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"numbers text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-responsive\" width=\"100%\" style=\"float:left;margin-left;max-width: 300px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/30.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div  style=\"height:200px;text-align:left;float: left; padding-left:30px;padding-top: 20px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆编号：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆信息：xx<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t车辆状态：xx\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"64px;padding-top: 34px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">解除异常状态</button>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-danger\">报废</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t版权所有：张博文\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/core/jquery.3.2.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/core/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/ready.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
