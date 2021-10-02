<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>게시글 수정</h2>
		<form action="_07bUpdateAction" method="post">
			<table border="1" style="width: 700px">
				<col width="30">
				<col width="70">
				<tr>
					<td>작성자</td>
					<td>${list.writer }</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td>${list.regdate}</td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="subject" id="subject" value="${list.subject }"></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="pw" id="pw"></td>
				</tr>
				<tr>
					<td>글 내용</td>
					<td><textarea rows="10" cols="50" name="content" id="content">${list.content }</textarea></td>
				</tr>
				<tr>
					<td>
						<input type="hidden" value="${list.num }" name="num" id="num">
						<input type="submit" value="글수정">
						<input type="button" value="전체글보기" onclick="location.href='_04_bList'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>