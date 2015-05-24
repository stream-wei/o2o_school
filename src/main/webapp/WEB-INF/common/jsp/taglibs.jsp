<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!-- 引入jstl标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!-- 如果报错需要引入tomcat下的jsp-api.jar 和  servlet-api.jar 一起添加到项目中 -->
<c:set var="ctx" value="<%=basePath%>" scope="page"/>
