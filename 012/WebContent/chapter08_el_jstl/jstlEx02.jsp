<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>분기문</title>
</head>
<body>
		<%-- 

		1) if문
			
			<c:if test="조건식"></c:if>   
		
			- 자바의 if문 기능을 한다.
			- test값의 조건식이 true면 실행된다.
			- 보통 EL로 사용한다.
			

			
		2)	when ~ otherwise문
		
			[형식]
		
			<c:choose> 								> 특정한 기능은 하지 않지만 문법적으로 사용해야 된다.
				<c:when test="조건식"> </c:when>	> 조건식이 참일 경우 수행된다. 보통 EL로 사용한다.
				<c:otherwise> </c:otherwise>  		> 조건식이 거짓일 경우 수행된다.
			</c:choose>
			
			- 자바의 if ~ else문 기능을 한다.
		
		
		
		3) 	when , when ~ otherwise문	
		
			[형식]
	
			<c:choose> 								 > 특정한 기능은 하지 않지만 문법적으로 사용해야 된다.
				<c:when test="조건식"></c:when> 	 > 조건식이 참일 경우 수행된다. 
				<c:when test="조건식"></c:when>								  
				<c:when test="조건식"></c:when>  
				<c:otherwise></c:otherwise>   		 
			</c:choose>
		
			- 자바의 if ~ else if문 기능을 한다.
			- 다중 택일로서 특정 구문이 실행되면 이하 구문은 실행되지 않는다.

	 --%>
	 
	 <h3>1) if문 </h3>
	 <C:set var="grade" value="90" />
	 <C:if test="${grade ge 90 }">
	 	A
	 </C:if>
	 <C:if test="${grade ge 80 }">
	 	B
	 </C:if>
	 <C:if test="${grade ge 70 }">
	 	C
	 </C:if>
   	 <hr>	 
	 
	 <h3>2) when ~ otherwise문 </h3>
	 
	 <C:choose>
	 	<C:when test="${grade ge 60 }">합격</C:when>
	 	<C:otherwise>불합격</C:otherwise>
	 </C:choose>
	 
	 <hr>
	 
	 <h3>when ~ when ~ otherwise</h3>
	 <C:choose>
	 	<C:when test="${grade ge 90 }">A</C:when>
	 	<C:when test="${grade ge 80 }">B</C:when>
	 	<C:when test="${grade ge 70 }">C</C:when>
	 	<C:otherwise>
	 		 불합격
	 	</C:otherwise>
	 </C:choose>
	 
	
</body>
</html>