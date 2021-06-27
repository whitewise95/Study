<%@page import="RentcarEx.rentcarDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="member" class="RentcarEx.memberBean">
	<jsp:setProperty property="*" name="member"/>
	</jsp:useBean>
	
	<%
	boolean isJoinMember= rentcarDAO.getInstance().joinMember(member);
	if(isJoinMember){
	%>
	
	<script>
		alert("회원가입되었습니다. 로그인해주세요");
		location.href="01_carMain.jsp"
	</script>
	<%
	}
	else{
	%>
		<script>
		alert("중복된 아이디 입니다.");
		location.href="01_carMain.jsp?center=05_memberJoin.jsp";
	</script>
	<%
	}
	%>
</body>
</html>