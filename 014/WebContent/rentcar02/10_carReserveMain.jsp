<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
</head>
<body>
	<div align="center">
	<table  >
		<tr align="center" >
			<td align="center" colspan="3">
				<jsp:include page="${pb.top }"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
			</td>
		</tr>
		<tr align="center">
				<td align="center" colspan="3" >
					<font size="5" color="gray">렌트카 전체 보기</font>
				</td>
			<c:set var="rb" value="${rbList }" />
			 <c:forEach var="i" items="${ rb }" begin="0" end="${max }" step="1" varStatus="status">
				<c:if test="${ status.index mod 3 eq 0}">
				 		<tr align="center" >
				 		</tr>
				</c:if>
				<td align="center" >
		 			<p><img alt="" src="rentcar02/imgCar/${i.img }" width="300" height="200"  onclick="location.href='rentCarInfo?num=${i.no}'"></p>
		 			<font color="gray">${i.company} | ${i.name}</font>
		 		</td>
	 		</c:forEach>
	 
		</tr>
		<tr align="center">
			<td align="center" colspan="3">
				<jsp:include page="${pb.bottom }"></jsp:include>
			</td>
		</tr>

	</table>
	</div>
</body>
</html>