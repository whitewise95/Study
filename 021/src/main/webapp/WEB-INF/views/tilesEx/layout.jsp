<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!-- tiles를 사용시 taglib를 추가해 주어야한다 -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레이아웃</title>
</head>
<body>
 	
 	<header>         <!-- 상단 -->
 		<tiles:insertAttribute name="header"/>
 	</header>	
 	<aside>			<!--메뉴 -->
 		<tiles:insertAttribute name="menu"/>
 	</aside>
 	<article>		<!--  컨텐츠 -->
 		<tiles:insertAttribute name="content"/>
 	</article>
 	<footer>		<!-- 하단 -->
 		<tiles:insertAttribute name="footer"/>
 	</footer>
</body>
</html>