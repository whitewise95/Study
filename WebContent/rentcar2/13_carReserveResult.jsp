
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="RentcarEx.rentcarBean"%>
<%@page import="RentcarEx.rentcarDAO"%>
<%@page import="RentcarEx.carreserveBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="rcar" class="RentcarEx.carreserveBean">
		<jsp:setProperty property="*" name="rcar"/>
	</jsp:useBean>
	<%
		Date d1 = new Date();
		Date d2 = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		d1 = sdf.parse(rcar.getRday());
		d2 = sdf.parse(sdf.format(d2));		//format() = SimpleDateFormat >> yyyy-MM-dd

		int s = d1.compareTo(d2);
		if(s<0){
	 %>
	 
			<script >
			alert("현재 시스템 날짜보다 이전 날짜는 선택할 수 없습니다.");
			history.go(-1);
			</script>
	<%
	
		}
	%>




	<%
	String id1 =(String)session.getAttribute("id");
	rcar.setId(id1);
	
	rentcarDAO.getInstance().reserveResult(rcar);
	rentcarBean rc = rentcarDAO.getInstance().oneCarInfo(rcar.getNo());
	
	int carPrice = rc.getPrice()*rcar.getQty() * rcar.getDday();
	int useIn = 0;
	if(rcar.getUseIn()==1){useIn=10000;}
	
	int useSeat =0;
	if(rcar.getUseSeat()==1){useSeat=10000;}
	
	int useWifi =0;
	if(rcar.getUseWifi()==1){useWifi=10000;}
	
	int carOption =(useIn *rcar.getDday())+(useSeat*rcar.getDday())+(useWifi*rcar.getDday());
	
	
	%>
	
	
	
	<p><font size="6" color="gray">차량 예약 완료</font></p>
	<p><img alt="" src="../rentcar/imgCar/<%=rc.getImg()%>"></p>
	<p><font size="4" color="red">차량 총 금액 : <%=carPrice %> </font></p>
	<p><font size="4" color="red">옵션 총 금액 : <%=carOption %> </font></p>
	<p><font size="4" color="red">총 금액 : <%=carPrice + carOption %></font></p>
	
</body>
</html>