<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약하기</title>
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
				<font size="6" color="gray" >${rb.name }차량 선택 </font>
			</td>
		</tr>	
		<tr>
			<td  align="center">
				<img alt="" src="rentcar02/imgCar/${rb.img }" style="width: 500px; height: 250px">
			</td>
			<td  align="center">
				<form action="carOption" method="post">
					<table style="width: 400px; height: 300px;">
						<tr align="left">
							<td>차량이름</td>
							<td>${rb.name }</td>	
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
							<td>${temp }</td>	
						</tr>
						<tr>
							<td>대여가격</td>
							<td>${rb.price }</td>	
						</tr>
						<tr>
							<td>제조회사</td>
							<td>${rb.company }</td>	
						</tr>
						<tr align="center">
							<td colspan="2" >
								<input type="hidden" value="${rb.no }" name="num">
								<input type="submit" value="옵션 선택">
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