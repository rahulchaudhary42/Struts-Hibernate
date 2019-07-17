
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="header">
  <a href="index.jsp" class="logo">StrutsApp</a>
</div>
<hr>
<br>
 <h1 style="text-align:center; ">Welcome To Login...</h1>
	<s:form method="post" action="login">
		<table align="center" style="color: green">
			<tr>
				<td><s:textfield name="email" label="Email" required="required"></s:textfield></td>
			</tr>
			<tr>
				<td><s:password name="password" label="Password"
						required="required"></s:password></td>
			</tr>
			<tr>
				<td></td>
				<td><s:submit value="login"></s:submit></td>
			</tr>
		</table>
	</s:form>
	<p align="center">
		<a href="forget.jsp"><input type="submit"
			value="ForgotPassword"></a>
	</p>
</body>
</html>