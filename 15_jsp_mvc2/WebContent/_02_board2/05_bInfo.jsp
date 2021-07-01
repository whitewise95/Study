<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="padding-top: 100px">
	 	<h2> 게시글 보기 </h2>
	 	<table border="1" style="width: 700px">
	 	<col width="30%">
	 	<col width="70%">
	 	
	 		<tr align="center">
	 			<td>글번호</td>
	 			<td>${list.num }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>조회수</td>
	 			<td>${list.readcount }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>글작성자</td>
	 			<td>${list.writer }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>작성일</td>
	 			<td>${list.regdate }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>이메일</td>
	 			<td>${list.email }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>제목</td>
	 			<td>${list.subject }</td>
	 		</tr>
	 		<tr align="center">
	 			<td>글내용</td>
	 			<td>${list.content }</td>
	 		</tr>
	 		<tr>
	 			<td>
	 				<input type="button" value="수정하기" onclick="location.href='_06bUpdate?num=${list.num }'">
	 				<input type="reset" value="다시쓰지">
	 				<input type="button" value="목록보기" onclick="location.href='_04_bList'">
	 			</td>
	 		</tr>
	 	</table>
	</div>
</body>
</html>