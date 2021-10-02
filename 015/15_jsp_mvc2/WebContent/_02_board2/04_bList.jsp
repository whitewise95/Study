<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center" style="padding-top: 100px">
			<h2>게시글 보기</h2>
			<table border="1">
				<col width="10%">
				<col width="40%">
				<col width="20%">
				<col width="20%">
				<col width="10%">
				<tr align="center">
					 <td>번호</td>
					 <td>제목</td>
					 <td>작성자</td>
					 <td>작성일</td>
					 <td>조회수</td>
				</tr>
				<c:forEach var="list" items="${list}">
					<c:set var="i" value="${i+1}"/>
					<tr>
						<td><c:out value="${i }"/></td>
						<td><a href="_05_bInfo?num=${list.num}">${list.subject }</a> </td>
						<td>${list.writer }</td>
						<td>${list.regdate }</td>
						<td>${list.readcount }</td>
					</tr>
				</c:forEach>	
				<tr>
					<td>
						<input type="button" value="글쓰기" onclick="location.href='_02_bWriter'">
					</td>
				</tr>
			</table>
		</div>
</body>
</html>