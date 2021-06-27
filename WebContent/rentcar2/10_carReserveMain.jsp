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
	// 로그인 되어있는 아이디를 읽어옴
 		String id = (String) session.getAttribute("id");
 		
 		if (id == null) {
%>
			<script type="text/javascript">
				alert("로그인을 먼저 해주세요.");
				location.href = '01_carMain.jsp?center=07_memberLogin.jsp';
			</script>
	<%
		}
	%> 
	<table>
		<tr align="center">
			<td colspan="3"><font size="6" color="gray" >전체 렌트카 보기</font></td>
		</tr>
		<%
			ArrayList<rentcarBean> rcList = rentcarDAO.getInstance().allRentCar();
				int j = 0;
				for(int i = 0; i<rcList.size(); i++){
					
					if(j%3 ==0){
		%>		
					<tr height="220">
		<%
					}
		%>
					<td width="330" align="center">
						<img alt="" src="../rentcar/imgCar/<%=rcList.get(i).getImg() %>" width="300" height="200" onclick="location.href='01_carMain.jsp?center=11_carReserveInfo.jsp&no=<%=rcList.get(i).getNo()%>'"> 
						<p><font size="3" color="gray"> <%=rcList.get(i).getCompany() %> || <%=rcList.get(i).getName() %></font></p>
					</td>
		<%	
					j++;
				}
		%>
		
		</tr>
	</table>
</body>
</html>