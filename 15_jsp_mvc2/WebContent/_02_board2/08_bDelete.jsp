<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 삭제</title>
</head>
<body>
	<div  align="center" style="padding-top: 100px">
		<h2>게시글 삭제</h2>
		<form action="_09bDeleteAction" method="post">
			<table border="1" style="width: 700px">
				<col width="30%">
				<col width="70%">
				<tr>
					<td>작성자</td>
					<td>${list.writer }</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td>${list.regdate }</td>
				</tr>
				<tr>
					<td>제목</td>
					<td>${list.subject}</td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" id="pw" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="hidden" value="${list.num }" name="num" id="num">
						<input type="submit" value="글삭제">
						<input type="button" value="목록보기"  onclick="location.href='_04_bList'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>