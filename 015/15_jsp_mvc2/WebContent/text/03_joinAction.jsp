<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${isJoin ne null}">
		<script>
			alert("회원가입을 축하드립니다.");
			location.href="main";
		</script>
	</c:if>
	<c:if test="${isJoin eq null}">
		<script>
			alert("중복된 아이디 입니다.");
			history.go(-1);
		</script>
	</c:if>
</body>
</html>