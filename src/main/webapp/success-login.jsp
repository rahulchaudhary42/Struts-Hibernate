<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Insert title here</title>
</head>
<body>
<div class="header">
		<a href="#default" class="logo">FundooApp</a>
	 
  </div>
 
	<hr>
<h3 style="text-align:center;padding-right: 5%;">Login is Successfull ...</h3>
<h4 style="text-align:center;padding-right: 5%;">Welcome: <s:property value="name"/>  </h4>
<br>

 <a  href="logout.jsp" style="padding-left: 850px;">Logout</a>