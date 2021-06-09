<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 사용 예시</title>
</head>
<body>
	<h2> 장바구니</h2>

		<h2>장바구니</h2>
	<% 
		request.setCharacterEncoding("utf-8");
	
		String id     = (String)session.getAttribute("id");
		String passwd = (String)session.getAttribute("passwd");
	%>
	아이디 : <%=id %> <br>
	패스워드 : <%=passwd %> <br>
	
	
	
	
	

</body>
</html>






