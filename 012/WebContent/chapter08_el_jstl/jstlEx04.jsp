<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 및 날짜 형식</title>
</head>
<body>

	<%--

		- 자주 쓰는 문법만 소개하며 상세한 옵션들은 상황이 생겼을때 JSTL API를 찾아가면서 적용하면 충분하다. 

 	 --%>
	

	<h3>날짜 형식</h3>
	<p>${now }</p>
	
	<h3>날짜 출력 형식 지정</h3>
	<p><fmt:formatDate value="${now }"/></p>
	<p><fmt:formatDate value="${now }" pattern="yyyyMMdd"/></p>
	<p><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일"/></p>
	<p><fmt:formatDate value="${now }" pattern="MM월 dd일"/></p>
	
	<hr>
	
		<h3>숫자 형식</h3>
	<p><fmt:formatNumber value="${nData}" /></p>										<!--  기본값 -->
	<p><fmt:formatNumber value="${nData}" type="currency" currencySymbol="$"/></p>		<!--  통화기호 -->
	<p><fmt:formatNumber value="${nData}" pattern=".0"/></p>							<!--  패턴지정(소수점) -->
	<p><fmt:formatNumber value="${nData}" pattern=".00"/></p>
	<p><fmt:formatNumber value="${nData}" pattern=".000"/></p>
	
	<p><fmt:formatNumber value="100" pattern="000"/></p>								<!--  패턴지정(빈 공간에0표기) -->
	<p><fmt:formatNumber value="10" pattern="000"/></p>
	<p><fmt:formatNumber value="1"  pattern="000"/></p>
	
	
</body>
</html>