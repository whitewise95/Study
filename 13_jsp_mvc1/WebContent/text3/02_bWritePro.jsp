<%@page import="stem2_01.boardDAO2"%>
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
		
	%>
	
	
	 <jsp:useBean id="boardDTO" class="stem2_01.boardDTO2" >
	 	<jsp:setProperty property="*" name="boardDTO"/>
	 </jsp:useBean>
	 
	 <%
	 	boardDAO2.getInstance().boardListAdd(boardDTO);
	 %>
	 
	 
</body>
</html>