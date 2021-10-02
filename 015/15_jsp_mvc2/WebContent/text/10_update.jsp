<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
		<c:when test="${isFirstApply eq false}">
		<h1>회원정보 수정</h1>
		<p>개인정보와 입사지원 내용을 확인해주세요</p>
		<hr>
		<p></p>
		<h5>개인정보</h5>
		<p></p>
		<form action="updateAction" method="post">
			<p><label for="id">이름 <input type="text" value="${dtdb.id }" name="id" id="id"></label></p>
			<p><label for="pw">이름 <input type="password" value="${dtdb.pw }" name="pw" id="pw"></label></p>
			<p><label for="name">이름 <input type="text" value="${dtdb.name }" name="name" id="name"></label></p>
			<p><label for="tel">연락처 <input type="text" value="${dtdb.tel }" name="tel" id="tel"></label></p>
			<p><label for="email">이메일 <input type="text" value="${dtdb.email }" name="email" id="email"></label></p>
			<hr>
			<p></p>
			<h5>지원 분야</h5>			
			<p></p>
			<p>				 
				<label><input type="radio" name="field" value="web"
				<c:if test="${dtdb.field eq 'web' }"> checked </c:if>>웹 퍼블리싱</label>
				<label><input type="radio" name="field" value="front"
				<c:if test="${dtdb.field eq 'front' }"> checked </c:if>>프론트앤드</label>
				<label><input type="radio" name="field" value="app"
				<c:if test="${dtdb.field eq 'app' }"> checked </c:if>>웹 애플리케이션 개발</label>
			</p>
			<hr>
			<p></p>
			<h5>기술 능력</h5>			
			<p></p>
			<p>             <!--  ("a",a)형태로 보냈는데요 받을 때는 "" 쓰는지 헷갈림 -->
				<label><input type="checkbox" name="skill" value="HTML"
				<c:if test="${HTML eq 'true' }"> checked </c:if>>HTML</label>
				<label><input type="checkbox" name="skill" value="CSS"
				<c:if test="${CSS eq 'true' }" > checked </c:if>>CSS</label>
				<label><input type="checkbox" name="skill" value="JavaScript"
				<c:if test="${JavaScript eq 'true' }"> checked </c:if>>JavaScript</label>
				<label><input type="checkbox" name="skill" value="Java"
				<c:if test="${Java eq 'true' }" >checked </c:if>>Java</label>
				<label><input type="checkbox" name="skill" value="JSP"
				<c:if test="${JSP eq 'true' }" >checked </c:if>>JSP</label>
				<label><input type="checkbox" name="skill" value="Spring"
				<c:if test="${Spring eq 'true' }" >checked </c:if>>Spring</label>
			</p>
			<hr>
			<p></p>
			<h5>지원 분야</h5>			
			<p></p>
			<p>
				<label for="major">
					<select name="major" id="major">  <!-- 벨류 기억하자 -->
						<option value="computer"
						<c:if test="${dtdb.major eq 'computer' }"> selected  </c:if>>컴터공학과</option>
						<option value="electric"
						<c:if test="${dtdb.major eq 'electric' }"> selected  </c:if>>전기전자공학과</option>
						<option value="machine"
						<c:if test="${dtdb.major eq 'machine' }" > selected  </c:if>>기계공학과</option>
						<option value="industry"
						<c:if test="${dtdb.major eq 'industry' }">selected  </c:if>>산업공학과</option>
					</select>
				</label>
			</p>
			<hr>
			<p>
				<input type="submit" value="수정하기">
				<input type="reset" value="다시 쓰기">
			</p>
		</form>

		</c:when>
		<c:otherwise>
			<script>
				alert("입사지원부터 해주세요");
				location.href="main";
			</script>
		</c:otherwise>
	</c:choose>
	</div>
</body>
</html>