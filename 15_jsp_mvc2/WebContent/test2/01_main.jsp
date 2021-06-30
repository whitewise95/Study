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
		<c:choose>
			<c:when test="${id eq null }">
				<p><a href="login2">로그인</a></p>
				<p><a href="join2">회원가입</a></p>
			</c:when>
			<c:otherwise>
				<p><a href ="update2">입사지원 수정</a></p>
				<p><a href ="logout2">로그아웃</a></p>
				<p><a href ="delete2">회원탈퇴</a></p>
			</c:otherwise>
		</c:choose>
		<hr>
		<a href="apply2"><img alt="" src="img/applyonline.png" ></a>
		</div>
</body>
</html>