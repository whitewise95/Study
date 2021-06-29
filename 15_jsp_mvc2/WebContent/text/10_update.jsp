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
		<c:when test="${isUpdate eq true }">
			<div align="center">
		<h1>회원정보 수정</h1>
		<p>개인정보와 입사지원 내용을 확인해주세요</p>
		<hr>
		<p></p>
		<h5>개인정보</h5>
		<p></p>
		<form action="applyAction" method="post">
			<p><label for="id">이름 <input type="text" value="${dtdb.id }" name="id" id="id"></label></p>
			<p><label for="pw">이름 <input type="password" value="${dtdb.pw }" name="pw" id="pw"></label></p>
			<p><label for="name">이름 <input type="text" value="${dtdb.name }" name="name" id="name"></label></p>
			<p><label for="tel">연락처 <input type="text" value="${dtdb.tel }" name="tel" id="tel"></label></p>
			<p><label for="email">이메일 <input type="text" value="${dtdb.email }" name="email" id="email"></label></p>
			<hr>
			<p></p>
			<h5>지원 분야</h5>			
			<p></p>
			<p>				   <!-- name은 같게 value는 다르게 -->  <!-- value로 해야하는 id로 함-->
				<label><input type="radio" name="field" value="web">웹 퍼블리싱</label>
				<label><input type="radio" name="field" value="front">프론트앤드</label>
				<label><input type="radio" name="field" value="app">웹 애플리케이션 개발</label>
			</p>
			<hr>
			<p></p>
			<h5>기술 능력</h5>			
			<p></p>
			<p>             <!-- name은 같게 id는 다르게 -->
				<label><input type="checkbox" name="skill" value="HTML">HTML</label>
				<label><input type="checkbox" name="skill" value="CSS">CSS</label>
				<label><input type="checkbox" name="skill" value="JavaScript">JavaScript</label>
				<label><input type="checkbox" name="skill" value="Java">Java</label>
				<label><input type="checkbox" name="skill" value="JSP">JSP</label>
				<label><input type="checkbox" name="skill" value="Spring">Spring</label>
			</p>
			<hr>
			<p></p>
			<h5>지원 분야</h5>			
			<p></p>
			<p>
				<label for="major">
					<select name="major" id="major">  <!-- 벨류 기억하자 -->
						<option value="computer">컴터공학과</option>
						<option value="electric">전기전자공학과</option>
						<option value="machine">기계공학과</option>
						<option value="industry">산업공학과</option>
					</select>
				</label>
			</p>
			<hr>
			<p>
				<input type="submit" value="접수하기">
				<input type="reset" value="다시 쓰기">
			</p>
		</form>
	</div>
		</c:when>
	</c:choose>
</body>
</html>