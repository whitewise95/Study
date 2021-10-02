<%@page import="step4_00_boardEx.BoardDAO2"%>
<%@page import="step4_00_boardEx.BoardDTO2"%>
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
		
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDTO2 boardList = BoardDAO2.getInstance().oneBoardList(num);
			
			
		%>
	
		<form action="07_bUpdatePro.jsp" method="post"  style=" padding-top: 100px">
			<h2 align="center">게시글 수정</h2>
			<table border="1" style="width: 700px" >
				<colgroup>
					 <col width="20%" align="right">
					 <col width="80%">
				</colgroup>
				<tr>
					<td>작성자</td>
					<td><%=boardList.getWriter()%></td>
				</tr>
				<tr>
					<td>작성일</td>
					<td><%=boardList.getRegDate()%></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="subject" value="<%=boardList.getSubject()%>"></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>글 내용</td>
					<td><textarea rows="20" cols="60" name="content"><%=boardList.getContent()%></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="left">
						<input type="hidden" name="num" value="<%=boardList.getNum()%>">
						<input type="submit" value="글수정" >
						<input type="button" value="전체게시글 보기" onclick="location.href='04_bList.jsp'">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>
