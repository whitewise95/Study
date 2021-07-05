<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table  >
			<tr align="center" >
				<td align="center" >
					<jsp:include page="${pb.top }"></jsp:include>
				</td>
			</tr>
			<tr >
				<td colspan="11" align="center">
					<font size="5" color="gray">예약된 차량입니다.</font>
				</td>
			</tr>
			<tr>
				<td align="center">
					<table border="1">
						<tr align="center">
							<td>이미지</td>
							<td width="100" >이름</td>
							<td width="100">대여일</td>
							<td width="100">대여기간</td>
							<td width="100">금액</td>
							<td width="100">수량</td>
							<td width="100">보험</td>
							<td width="100">wifi</td>
							<td width="100">네비게이션</td>
							<td width="100">베이비시트</td>
							<td width="100">삭제</td>
						</tr>
						<c:forEach var="i" items="${cbList }">
							<tr align="center">
								<td><img alt="" src="rentcar02/imgCar/${i.img }"  width="150" height="100"> </td>
								<td>${i.name }</td>
								<td>${i.rday }</td>
								<td>${i.dday }</td>
								<td>${i.price }</td>
								<td>${i.qty }</td>
								<td>${i.useIn }</td>
								<td>${i.useWifi }</td>
								<td>${i.useNavi }</td>
								<td>${i.useSeat }</td>
								<td><input type="button" value="삭제" onclick="location.href='del?rday=${i.rday }'"></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
			<tr align="center">
				<td align="center" >
					<jsp:include page="${pb.bottom }"></jsp:include>
				</td>
			</tr>
			
		</table>
	</div>
</body>
</html>