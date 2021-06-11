<%@page import="stem2_01.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		String pwd = request.getParameter("pwd");
		
		boolean isLeaveMember = DAO.getInstance().LeaverMember(id,pwd);
		
		if(isLeaveMember){
			session.invalidate();
	%>
			<script>
				alert("탈퇴되었습니다.");
				location.href="00_main.jsp";
			</script>
	<% 		
			
		}
		else{
	%>
			<script>
				alert("비밀번호 및 아이디를 확인해주세요");
				history.go(-1);
			</script>
	<% 			
		}
	
	%>
	
	
</body>
</html>