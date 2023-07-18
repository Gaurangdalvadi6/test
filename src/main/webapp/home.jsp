<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (session.getAttribute("data") == null)
		response.sendRedirect("index.jsp");
	%>
	<%
	User u1 = null;
	if (session.getAttribute("data") != null) {
		u1 = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	
	<table>
		<tr>
			<td>ID :</td>
			<td><%=u1.getId()%></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><%=u1.getName()%></td>
		</tr>
		<tr>
			<td>Contact :</td>
			<td><%=u1.getContact()%></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><%=u1.getGender()%></td>
		</tr>
		<tr>
			<td>DOB :</td>
			<td><%=u1.getDob()%>></td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><%=u1.getAddress()%>></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><%=u1.getEmail() %></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><%=u1.getPassword() %>></td>
		</tr>
	</table>

</body>
</html>