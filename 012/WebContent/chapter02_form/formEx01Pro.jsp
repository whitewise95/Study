<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 기초</title>
</head>
<body>

	<%--
	
		- 폼 전송을 통해서 넘어 오는 데이터는 request객체를 통해서 전달을 받는다.
		- 페이지의 encoding설정 외에 request객체의 encoding을 추가로 지정해 주어야한다.
		- request.getParameter(); 메소드를 통해서 form을 통해 넘어온 데이터의 name속성 값을 가져온다.
		- request.getParameter(); 의 기본 반환타입은 문자열이다.
	 
	 --%>

	<% 
	
		request.setCharacterEncoding("utf-8");
	
		String language = request.getParameter("language");
		String reason = request.getParameter("reason");
		// String languageCnt = request.getParameter("languageCnt"); // 문자열
	
		int languageCnt = Integer.parseInt(request.getParameter("languageCnt"));
		
		
		System.out.println("====================");
		System.out.println("여기서부터는 '백앤드'의 영역입니다.");
		System.out.println("개발자에게는 보이지만 사용자에게는 보이지 않습니다.");
		System.out.println("좋아하는 언어 : " + language);
		System.out.println("좋아하는 이유 : " + reason);
		System.out.println("사용가능한 언어의 개수 : " + languageCnt);
		System.out.println();
	
	%>
</body>
</html>

