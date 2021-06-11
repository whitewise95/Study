<%@page import="step2_00_loginEx.MemberDAO"%>
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
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		boolean isUpdate = MemberDAO.getInstance().updateMember(id ,pwd ,name);
		
		if(isUpdate){
	%>
		<script>
			alert("update");
			location.href="00_main.jsp"
		</script>
	<%			
		}
		else{
	%>
		<script>
			alert("check your id and pwd");
			history.go(-1);
		</script>	
	<%		
		}
	
	%>
</body>
</html>