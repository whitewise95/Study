<%@page import="stem2_01.boardDAO2"%>
<%@page import="stem2_01.boardDTO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 보기</h1>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%
				ArrayList<boardDTO2> bd = boardDAO2.getInstance().allshow();
				
				for (int i = 0; i<bd.size(); i++){
		%>
			<tr>
				<td><%=bd.get(i).getNum()%></td>
				<td><%=bd.get(i).getSubject()%></td>
				<td><%=bd.get(i).getWriter()%></td>
				<td><%=bd.get(i).getRegdate()%></td>
				<td><%=bd.get(i).getReadconut()%></td>
			</tr>	
		<%
				}
		%>
			<tr align="right">
			<td colspan="5">
				<input type="button" value="글쓰기" onclick="location.href='02_bWrite.jsp'">
			</td>
		</tr>
		
		
	</table>


</body>
</html>