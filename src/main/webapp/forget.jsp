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
 <h1 style="text-align:center; ">Forget Password...</h1>
  <s:form method="post" action="forget">
		<table align="center" style="color: green">
		 
			<tr>

				<td><s:textfield name="Email" label="Email" required="required"></s:textfield></td>
			</tr>

			<tr>
				<td></td>
				<td><s:submit value="forget"></s:submit></td>
			</tr>


		</table>
   </s:form>


</body>
</html>