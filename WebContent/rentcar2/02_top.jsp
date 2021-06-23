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
		<tr>
			<td align="left" colspan="2"><img alt="회사로고" src="../rentcar/imgCar/rent_logo.jpg"  height="120"></td>
			<td align="right" colspan="3" width="200">
		<%
			if(id.equals("guest")){
		%>
				<%=id %>님 <input type="button" value="로그인" onclick="">
		<%
			}
			 else if(id.equals("admin")){
		%>
				<%=id %>님 <input type="button" value="관리자메뉴" onclick="">
							<input type="button" value="로그아웃" onclick="">
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