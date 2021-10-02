<%@page import="step4_00_boardEx.BoardDAO2"%>
<%@page import="step4_00_boardEx.BoardDTO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</head>
<body>
			<%
				request.setCharacterEncoding("utf-8");
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDTO2 boardList = BoardDAO2.getInstance().oneBoardList(num);
			
			
			%>
		
		<div align="center" style="padding-top: 100px">
		<h1>게시글 보기</h1>
		<br>
		<table style="width: 700px; text-align: center" border="1">
			<colgroup>
				<col width="20%">
				<col width="80%">
				</colgroup>
				<tr>
					<td>글번호</td>
					<td><%=boardList.getNum() %></td>
				</tr>
				<tr>
					<td>조회수</td>
					<td><%=boardList.getReadCount()%></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><%=boardList.getWriter()%></td>
				</tr>
				<tr>
					<td>작성일</td>
					<td><%=boardList.getRegDate()%></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><%=boardList.getEmail()%></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><%=boardList.getSubject()%></td>
				</tr>
				<tr>
					<td>글 내용</td>
					<td><%=boardList.getContent()%></td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="button" value="답글쓰기" onclick="location.href='10_bRe.jsp?num=<%=boardList.getNum()%>'">
						<input type="button" value="수정하기" onclick="location.href='06_bUpdate.jsp?num=<%=boardList.getNum()%>'">
						<input type="button" value="삭제하기" onclick="location.href='08_bDelete.jsp?num=<%=boardList.getNum()%>'">
						<input type="button" value="목록보기" onclick="location.href='04_bList.jsp'">
					</td>
				</tr>
			</table>
			</div>
</body>
</html>