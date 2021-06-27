<%@page import="RentcarEx.rentcarDAO"%>
<%@page import="RentcarEx.rentcarBean"%>
<%@page import="java.util.ArrayList"%>
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
		int no =Integer.parseInt(request.getParameter("no"));
		
		rentcarBean rc = rentcarDAO.getInstance().oneCarInfo(no);
	%>
		<form action="01_carMain.jsp?center=12_carOptionSelect.jsp" method="post">
			<table>
				<tr>
					<td align="center" colspan="2">
						<font size="6" color="gray">아반떼 차량 선택</font>
					</td>
				</tr>
				<tr>
					<td>
						<img alt="자동차" src="../rentcar/imgCar/<%=rc.getImg() %>">
					</td>
					<td>
					<table>
						<tr>
							<td>차량이름</td>
							<td><%=rc.getName() %></td>
						</tr>
						<tr>
							<td>차량수량</td>
							<td>
								<select name="qty">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>차량분류</td>
			
							<td>
			<%
								if(rc.getCategory()==1){
			%>
									소형
			<% 
								}
								if(rc.getCategory()==2){
			%>
									중형
			<% 
								}
								if(rc.getCategory()==3){
			%>
									대형
			<% 
								}
		    %>
						   </td>
						</tr>
						<tr>
							<td>차량가격</td>
							<td><%=rc.getPrice()%></td>
						</tr>
						<tr>
							<td>제조회사</td>
							<td><%=rc.getCompany() %></td>
						</tr>
						<tr>
							<td>	
								<input type="hidden" value="<%=rc.getImg() %>" name="img">
								<input type="hidden" value="<%=rc.getNo() %>" name="no">
								<input type="submit" value="옵션 선택후 구매하기" >
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>