<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${isJoin eq true }">
			<script>
				alert("회원가입 되었습니다. 축하드립니다.");
				location = "main";
			</script>
		</c:when>
		<c:otherwise>
			<script>
				alert("이미 가입된 아이디 입니다.");
				history.go(-1);
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>