<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>

	<!-- 
	
		# forward
		
		- 사용자의 상황에 따라 다른 문서로 이동시키기 위한 액션태그
		
		- response.sendRedirect() 와 비슷한 기능을 하지만 url을 웹브라우저에 노출시키지 않는 특징이 있다.
		
		- param 액션 태그를 통해 데이터를 전달할 수 있다.
		
	 -->
	 
	<!-- html --> 
	
	<jsp:forward page="forwardEx01_target.jsp" />
	 
	 
	<!-- java --> 
	<% 
		//response.sendRedirect("forwardEx01_target.jsp");
	%>
	 
	  
	<!-- javascript -->
	<script>
		//location.href="forwardEx01_target.jsp";	
	</script>
	
</body>
</html>