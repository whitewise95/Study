<%@page import="stem2_01.DTO"%>
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
		String pwd = request.getParameter("pw");
		String name = request.getParameter("name");
		
		boolean isFirstMember =DAO.getInstance().insert(new DTO(id,pwd,name));
		
		if(isFirstMember){
	%>
		<script>
			alert("가입되었습니다.");
			location.href = "00_main.jsp";
		</script>
	<%
		}
		else{
	%>
		<script>
			alert("try other Id");
			history.go(-1);
		</script>
	<% 
		}
	%>
</body>
</html>