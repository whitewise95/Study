<%@page import="step4_00_boardEx.BoardDAO2"%>
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
		%>
		
		<jsp:useBean id="boardDTO" class="step4_00_boardEx.BoardDTO2">
			<jsp:setProperty property="*" name="boardDTO"/>
		</jsp:useBean>
		
		<%
			BoardDAO2.getInstance().reWriteBoard(boardDTO);
		 %>
		 
		 <script>
		 	alert("댓글이 작성되었습니다.");
		 	location.href="04_bList.jsp";
		 </script>
</body>
</html>