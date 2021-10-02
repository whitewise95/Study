<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력</title>
</head>
<body>

	<h3>1. 출력</h3>   <!-- html 문법 -->

	<%  // 자바 문법
		String name = "팀 버너스 리";
		
		// (참고)
		out.println(name); 		  // 자바에서 html화면에 자바데이터를 출력하는 메서드
		System.out.println(name); // 자바 console에 데이터를 출력
	%>
	<hr>
	출력 결과 : name 

	<hr>
	출력 결과 : <%=name %>  <!-- html에서 자바 변수 출력방법 -->
</body>
</html>


