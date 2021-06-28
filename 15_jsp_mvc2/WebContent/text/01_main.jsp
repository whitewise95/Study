<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>

		<div align="center">
		<c:if test="${null ne id }">
			${id }님, 환영합니다.
		
			<p><a href= >입사지원정보 수정</a></p>
			<p></p>
			<p><a href= >로그아웃</a></p>
			<p></p>
			<p><a href= >탈퇴</a><a></a>
		</c:if>	
		<c:if test="${null eq id }">	
			<p><a href="join" >회원가입</a></p>
			<p></p>
			<p><a href=login>로그인</a></p>
			<p></p>
		</c:if>
		<hr>
		<p></p>
		<p></p>
		<p></p>
		<img alt="" src="img/applyonline.png" onclick="location.href=''">
		</div>
		
</body>
</html>