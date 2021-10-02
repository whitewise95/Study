<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
	<c:choose>
		<c:when test="${isDelete eq true }">
			<script >
				alert("게시글이 삭제되었습니다.");
				location.href="_04_bList";
			</script>
		</c:when>
		<c:otherwise>
			<script >
				alert("비밀번호가 틀렸습니다. 확인해주세요");
				histoty.go(-1);
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>