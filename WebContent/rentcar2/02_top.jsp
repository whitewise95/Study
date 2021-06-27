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
	
	<table>
		<tr>
			<td align="left" colspan="2"><img alt="회사로고" src="../rentcar/imgCar/rent_logo.jpg"  height="120"></td>
			<td align="right" colspan="3" width="200">
		<%
			if(id.equals("guest")){
		%>
				<%=id %>님 <input type="button" value="로그인" onclick="location.href='01_carMain.jsp?center=07_memberLogin.jsp'">
		<%
			}
			 else if(id.equals("admin")){
		%>
				<%=id %>님 <input type="button" value="관리자메뉴" onclick="">
							<input type="button" value="로그아웃" onclick="location.href='09_memberLogout.jsp'">
		<%
			}
			 else{
		%>
					<%=id %>님 <input type="button" value="로그아웃" onclick="location.href='09_memberLogout.jsp'">
		<%		 
			 }
		%>

			</td>

		<tr style="background-color: pink; " align="center">
			<td width="200" >
				<font size="5" color="white">
			
		<%
					if(id.equals("admin")){
		%>	
					예약하기
		<% 
					}
					else{
		%>
					<a href="01_carMain.jsp?center=10_carReserveMain.jsp">예약하기</a>
		<% 
					}
		%>	
				</font>
			</td>
			<td width="200" >
				<font size="5" color="white">
							
		<%
					if(id.equals("admin")){
		%>	
					예약확인
		<% 
					}
					else{
		%>
					<a href="01_carMain.jsp?center=14_carReserveMain.jsp">예약확인</a>
		<% 
					}
		%>
				</font>
			</td>
			<td width="200" >
				<font size="5" color="white">
					자유게시판
				</font>
			</td>
			<td width="200" >
				<font size="5" color="white">
					이벤트
				</font>
			</td>
			<td width="200" >
				<font size="5" color="white">
					고객센터
				</font>
			</td>
		</tr>
	</table>
</body>
</html>