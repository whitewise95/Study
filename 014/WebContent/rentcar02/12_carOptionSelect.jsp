<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<table  >
		<tr align="center" >
			<td align="center" colspan="2">
				<jsp:include page="${pb.top }"></jsp:include>
			</td>
		</tr>
		<tr>
			<td>
			</td>
		</tr>
		<tr align="center">
			<td align="center" colspan="2"  >
				<font size="6" color="gray" > 옵션 선택 </font>
			</td>
		</tr>	
		<tr>
			<td  align="center">
				<img alt="" src="rentcar02/imgCar/${rb.img }" style="width: 500px; height: 250px">
			</td>
			<td  align="center">
				<form action="carOptionAction" method="post">
					<table style="width: 400px; height: 300px;">
						<tr align="left">
							<td>대여기간</td>
							<td>${rb.name }</td>	
						</tr>
						<tr>
							<td>대여기간</td>
							<td>
								<select name="dday">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
								</select>
							</td>	
						</tr>
						<tr>
							<td>대여일</td>
							<td>
								<input type="date" name="rday" id="rday" size="15">
							</td>	
						</tr>
						<tr>
							<td>보험</td>
							<td>
								<select name="useIn">
									<option value="1">적용(1일1만원)</option>
									<option value="0">미적용</option>
								</select>
							</td>	
						</tr>
						<tr>
							<td>Wifi</td>
							<td>
								<select name="useWifi">
									<option value="1">적용(1일1만원)</option>
									<option value="0">미적용</option>
								</select>
							</td>	
						</tr>
						<tr>
							<td>네비게이션</td>
							<td>
								<select name="useNavi">
									<option value="1">적용(무료)</option>
									<option value="0">미적용</option>
								</select>
							</td>	
						</tr>
						<tr>
							<td>베이비시트</td>
							<td>
								<select name="useSeat">
									<option value="1">적용(1일1만원)</option>
									<option value="0">미적용</option>
								</select>
							</td>	
						</tr>
						<tr align="center">
							<td colspan="2" >
								<input type="hidden" value="${qty}" name="qty">
								<input type="hidden" value="${rb.no }" name="no">
								<input type="submit" value="차량예약하기">
							</td>
						</tr>
					</table>
				</form>
			</td>		
		</tr>
		<tr>
			<td align="center" colspan="2">
				<p><font size="5" color="gray">차량정보보기</font></p>
				<font size="3"> ${rb.info }</font>
			</td>
		</tr>
		<tr align="center">
			<td align="center" colspan="2">
				<jsp:include page="${pb.bottom }"></jsp:include>
			</td>
		</tr>

	</table>
	</div>
</body>
</html>