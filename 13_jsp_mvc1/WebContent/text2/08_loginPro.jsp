<%@page import="stem2_01.DAO"%>
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
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean isLogin = DAO.getInstance().Login(id,pw);
		
		if(isLogin){
			session.setAttribute("id", id);
			session.setMaxInactiveInterval(60*10);
			response.sendRedirect("00_main.jsp");
			
		}
		else{
	%>
		<script>
			alert("check your Id or Password");
			history.go(-1);
		</script>
	<% 	
		}
	%>
		
	%>
</body>
</html>