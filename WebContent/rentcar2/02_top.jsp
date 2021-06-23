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
		String id = (String)session.getAttribute("id");
		
		if(id==null){
			id = "guest";
		}
	%>
	
	<table style="padding-left: 30%;  align-content: center;"  >
	<colgroup>
		<col width="20%">
		<col width="20%">
		<col width="20%">
		<col width="20%">
		<col width="20%">
	</colgroup>
		<tr>
			<td align="left" ><img alt="회사로고" src="../rentcar/imgCar/rent_logo.jpg" width="60" height="50"></td>
			<td align="right" colspan="4">
		<%
			if(id.equals("guest")){
		%>
				<%=id %>님 <input type="button" value="로그인" onclick="">
		<%
			}
			else{
		%>
				<%=id %>님 <input type="button" value="로그아웃" onclick="">
		<%
			}
		%>

			</td>

		<tr style="background-color: pink;">
			<td>예약하기</td>
			<td>예약확인</td>
			<td>자유게시판</td>
			<td>이벤트</td>
			<td>고객센터</td>
		</tr>
	</table>
</body>
</html>