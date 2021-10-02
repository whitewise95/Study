<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 기초</title>
</head>
<body>

	<%--   
	
		# EL (Expression Language)
		
			- 자바코드를 사용하지 않고 간편하게 출력을 지원하기 위한 방법이다.
			- 자바의 문법과 html의 태그요소들이 섞여있기에 프론트와 백앤드의 효율적인 업무 분리 작업을 위하여
			  나온 표현방법이 EL이다.
			- $ 와 {}를 사용하여 표현한다.
	
	
			[ 형식 ]
			
			${표현1.표현2}     : $ 와 {}를 사용하여 표현한다.



			[표현1 상세]	
			
			${param.} 			  : 파라미터값 접근        
			${paramValues.} 	  : 파라미터값 배열로 접근  
			${sessionScope.}	  : 세션Scope에 접근
			${pageScope.}		  : 페이지Scope에 접근
			${requestScope.} 	  : 리퀘스트Scope에 접근
			${applicationScope.}  : 어플리케이션Scope에 접근



			[표현2 상세]
			
			- form형식의 name값 , 세션 및 쿠키의 id 값 등등
			
			
			
			[ 예시 ] 
			 
			${param.contact}   : 파라메타로 전달되는 값 중에 contact속성
			${param.grade}     : 파라메타로 전달되는 값 중에 grade속성
			${sessionScope.id} : session중에 id속성
		
	
	--%>
	
		<h2>자바의 변수 표기</h2>
		<p>${name }</p>s
		<p>${num1 }</p>
		<p>${num2 }</p>
		<hr>
		
		<h2>산술연산자</h2>
		<p>${num1 + num2}</p>
		<p>${num1 - num2}</p>
		<p>${num1 * num2}</p>
		<p>${num1 / num2} , ${num1 div num2 }</p>
		<p>${num1 % num2} , ${num1 mod num2 }</p>
		
		<hr>
		
		
		<h2>관계 연산자</h2>
		<p>${num1 > num2}  , ${num1 gt num2}</p> <!-- Greater Than -->
		<p>${num1 >= num2} , ${num1 ge num2}</p> <!-- Greater than or Equal to -->
		<p>${num1 < num2}  , ${num1 lt num2}</p> <!-- Less than -->
		<p>${num1 <= num2} , ${num1 le num2}</p> <!-- Less than or Equal to -->
		<p>${num1 == num2} , ${num1 eq num2}</p> <!-- EQual -->
		<p>${num1 != num2} , ${num1 ne num2}</p> <!-- Not Equal -->
		<hr>

		<h2>논리연산자</h2>
		<p>${1 == 1 && 1 == 1 } , ${1 == 1 and 1 == 1 }</p>
		<p>${1 == 1 || 1 == 1 } , ${1 == 1  or 1 == 1 }</p>
		<p>		${!(1 == 1)}    ,     ${not(1 == 1)}   </p>


		



</body>
</html>