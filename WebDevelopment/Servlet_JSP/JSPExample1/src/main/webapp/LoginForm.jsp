<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  method="post">
	<input type="text" name="txtuser" required><br><br>
	<input type="password" name="txtpword" required><br><br>
	<input type="submit" value="submit">
	<%
	String uname=request.getParameter("txtuser");
	String pword=request.getParameter("txtpword");
	
if(uname !=null)
	out.println("Welcome User"+uname);
	
	%>
</form>
</body>
</html>