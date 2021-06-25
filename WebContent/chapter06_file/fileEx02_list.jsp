<%@page import="java.util.ArrayList"%>
<%@page import="_06_file.FileDTO"%>
<%@page import="_06_file.FileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		ArrayList<FileDTO> lists = FileDAO.getInstance().getFileList();
	%>
	<table border="1">
		<tr  align="center">
			<th>작성자</th>
			<th>제목</th>
			<th>파일명</th>
			<th>첨부파일</th>
			<th>날짜</th>
		</tr>
	<% 
		for (int i=0; i<lists.size(); i++){
	%>
		<tr align="center">
			<td><%=lists.get(i).getUserName() %> </td>
			<td><%=lists.get(i).getTitle() %> </td>
			<td><%=lists.get(i).getOriginFileName() %> </td>
			<td>
				<a href="fileEx02_download.jsp?fileName=<%=lists.get(i).getOriginFileName()%>">다운</a>
			</td>
			<td><%=lists.get(i).getFileUploadDate() %> </td>
		</tr>
	<% 
		}	
	%>
	</table>
</body>
</html>