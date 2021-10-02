<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<table>
		<tr align="center" >
			<td align="center">
				<jsp:include page="${pb.top }"></jsp:include>
			</td>
		</tr>
		<tr align="center">
			<td align="center">
				<jsp:include page="${pb.center }" ></jsp:include>
			</td>
		</tr>
		<tr align="center">
			<td align="center">
				<jsp:include page="${pb.bottom }"></jsp:include>
			</td>
		</tr>

	</table>
	</div>
</body>
</html>