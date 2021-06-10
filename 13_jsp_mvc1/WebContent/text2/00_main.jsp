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
		String id = (String)session.getAttribute("id");
	 
	 
	 if(id==null){	 
	%>
	  	<h2>로그인해주세요</h2>
	  	<p><a href="01_insert.jsp">join</a></p>
	  	<p><a href="07_login.jsp">login</a></p>
	  	
	<%	 
	 }
	 else{
	%>
		<h2>환영합니다.<%=id %>님</h2>
		<p><a  href = "03_ delete.jsp">Delete!</a></p>
		<p><a  href = "05_ update.jsp">Update!</a></p>
		<p><a  href = "09_ logout.jsp">Logout!</a></p>
	 
	<%
	}
	 %>
	
		





</body>
</html>