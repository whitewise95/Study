<%@page import="step2_00_loginEx.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginPro</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id	  = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		boolean isValidMember = MemberDAO.getInstance().login(id,passwd);
		
		if(isValidMember){
			session.setAttribute("id", id);
			session.setMaxInactiveInterval(60*10);
			
			// 00_main.jsp로 페이지이동
			// javascript의 location.href와 같은 기능을 한다.
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
		
</body>
</html>