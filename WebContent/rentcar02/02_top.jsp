<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr align="center" style="width: 150px">
			<td width="220px" >
				<img alt="" src="rentcar02/imgCar/rent_logo.jpg" height="130px">
			</td>
		
			<td	colspan="4" align="right">
				<!-- sessionScope.id 를 그냥 id 로 입력함 -->
				<c:choose>
					<c:when test="${sessionScope.id eq null }">
						<a>guest 님</a>
						<input type="button" value="회원가입" onclick="location.href='join'">						
						<input type="button" value="로그인" onclick="location.href='login'">
					</c:when>
					<c:when test="${sessionScope.id eq 'admin' }">
						<a>${ sessionScope.id }님 </a>
						<input type="button" value="관리자메뉴" onclick="location.href='main?center=16_admin.jsp'">
						<input type="button" value="로그아웃" onclick="location.href='logout'">
					</c:when>
					<c:otherwise>
						<a>${sessionScope.id }님</a>
						<input type="button" value="로그아웃" onclick="location.href='logout'">
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr height="50px">
			<td bgcolor="pink" width="200"><font color="white" size="5">
			<c:choose>
				<c:when test="${sessionScope.id eq admin}">
					<a>예약하기</a>
				</c:when>
				<c:otherwise>
					<a href="carReserve">예약하기</a>
				</c:otherwise>
			</c:choose>
			</font></td>
			<td bgcolor="pink" width="200"><font color="white"  size="5">
				<c:choose>
					<c:when test="${sessionScope.id eq admin}">
						<a>예약확인</a>
					</c:when>
					<c:otherwise>
						<a href="carReserveView">예약확인</a>
					</c:otherwise>
				</c:choose>
			</font></td>
			<td bgcolor="pink" width="200"><font color="white"  size="5">자유게시판</font></td>
			<td bgcolor="pink" width="200"><font color="white"  size="5">이벤트</font></td>
			<td bgcolor="pink" width="200"><font color="white"  size="5">공지사항</font></td>
		</tr>	
	</table>
</body>
</html>