<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function() {
		document.getElementById("tday").value = new Date().toISOString().substring(0,10);
	}
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		int no =Integer.parseInt(request.getParameter("no"));
		String img = request.getParameter("img");
		int qty =Integer.parseInt(request.getParameter("qty"));
	%>
		<form action="01_carMain.jsp?center=13_carReserveResult.jsp" method="post">
			<table>
				<tr>
					<td align="center" colspan="2">
						<font size="6" color="gray">옵션 선택</font>
					</td>
				</tr>
				<tr>
					<td>
						<img alt="자동차" src="../rentcar/imgCar/<%=img %>">
					</td>
					<td>
					<table>
						<tr>
							<td>대여기간</td>
							<td>
								<select name="dday">
									<option value="1">1일</option>
									<option value="2">2일</option>
									<option value="3">3일</option>
									<option value="4">4일</option>
									<option value="5">5일</option>
									<option value="6">6일</option>
									<option value="7">7일</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>대여일</td>
							<td><input type="date" name="rday" id="tday"></td>
						</tr>
						<tr>
							<td>보험</td>
							<td>
								<select name="useIn">
									<option value="1">적용(1일 1만원)</option>
									<option value="2">안함</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>Wifi</td>
							<td>
								<select name="useWifi" >
									<option value="1">적용(1일 1만원)</option>
									<option value="2">안함</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>네비게이션</td>
							<td>
								<select name="useNavi">
									<option value="1">적용(무료)</option>
									<option value="2">비적용</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>베이비시트</td>
							<td>
								<select name="useSeat">
									<option value="1">적용(1일 1만원)</option>
									<option value="2">비적용</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>	
								<input type="hidden" value="<%=qty%>" name="qty">
								<input type="hidden" value="<%=no %>" name="no">
								<input type="submit" value="차량예약하기" >
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>