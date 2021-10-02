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
			<td align="center" >
				<jsp:include page="${pb.top }"></jsp:include>
			</td>
		</tr>
		<tr align="center">
			<td align="center"   >
				<font size="6" color="gray" > 차량 예약 완료 </font>
			</td>
		</tr>	
		<tr>
			<td  align="center">
				<img alt="" src="rentcar02/imgCar/${rb.img }" style="width: 500px; height: 250px">
			</td>	
		</tr>
		<tr align="center">
			<td>
				<font color="red" size="4">차량 총 예약 금액 : ${carPrice }</font>
			</td>
		<tr align="center">	
		
			<td>
				<font color="red" size="4">차량 총 옵션 금액 :${optionPrice } </font>
			</td>
		</tr>
		<tr align="center">
			<td>
				<font color="red" size="4">차량 총 금액 : ${total} </font>
			</td>
		</tr>
		<tr>
			<td align="center" >
				<p><font size="5" color="gray">예약이 완료 되었습니다.이용해주셔서 감사합니다.</font></p>
			</td>
		</tr>
		<tr align="center">
			<td align="center" >
				<jsp:include page="${pb.bottom }"></jsp:include>
			</td>
		</tr>

	</table>
	</div>
</body>
</html>