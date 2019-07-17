
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>User Registration</title>
</head>
<body>
	<div class="header">
		<a href="index.jsp" class="logo">StrutsApp</a>

	</div>
	<hr>
	<br>
	<h1 style="text-align: center">Welcome To Registration...</h1>

	<div align="center">
		<s:form action="register">
			<table align="center" style="color: green">
				<tr>
					<td><s:textfield name="name" label="Name" required="required"></s:textfield></td>
				</tr>

				<tr>
					<td><s:textfield name="email" label="Email"
							required="required"></s:textfield></td>
				</tr>
				<tr>
					<td><s:password name="password" label="Password"
							required="required"></s:password></td>
				</tr>
				<tr>
					<td><s:textfield name="mobileno" label="MobileNo"
							required="required"></s:textfield></td>
				</tr>
				<tr>
					<td align="center"><s:submit value="register"></s:submit></td>
					<td align="center"><input type="reset" name="Reset Form"></td>
				</tr>
			</table>
		</s:form>
	</div>
</body>
</html>




