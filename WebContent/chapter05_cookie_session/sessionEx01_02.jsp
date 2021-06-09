<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 폼 처리 페이지</h2>
	<% 
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
	%>
	
	아이디 : <%=id %> <br>
	패스워드 : <%=passwd %> <br>
	<a href="sessionEx01_03.jsp">마이페이지로 이동</a>
	
	

</body>
</html>