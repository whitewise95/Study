<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>

	<!-- html -->
	<jsp:forward page="forwardEx02_target.jsp">
		<jsp:param value='<%=URLEncoder.encode("팀 버너스 리" , "utf-8") %>' name="sampleData1"/>
		<jsp:param value="Timothy John Berners Lee" name="sampleData2"/>
	</jsp:forward>


	<!-- java -->
	<% 
		//String sampleData1 = URLEncoder.encode("팀 버너스 리" , "utf-8");
		//String sampleData2 = "Timothy John Berners Lee";
	
		//response.sendRedirect("forwardEx02_target.jsp?sampleData1="+sampleData1+"&sampleData2="+sampleData2);
	%>


	<!-- javascript -->
	<script>
	/*
		var sampleData1 = "팀 버너스 리";
		var sampleData2 = "Timothy John Berners Lee";
		
		//location.href="forwardEx02_target.jsp?sampleData1="+sampleData1+"&sampleData2="+sampleData2;
		
		var url = "forwardEx02_target.jsp";	
			   url += "?sampleData1="+sampleData1;
			   url += "&sampleData2="+sampleData2;
		
		location.href = url;
	*/
	</script>
</body>
</html>

