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
  <a href="index.jsp" class="logo">StrutsApp</a>
</div>
<hr>
<br>
 <h1 style="text-align:center; ">Reset Password...</h1>
 <s:form method="post" action="reset">

		<s:textfield name="userId" label="UserID" required="required"></s:textfield>
		<s:password name="password" label="password" required="required"></s:password>
		<s:password name="cpassword" label="ConfirmPassword" required="required"></s:password>
		<s:submit value="set"></s:submit>
	</s:form>


</body>
</html>