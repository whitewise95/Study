<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
		
			
			Connection conn = null;
			PreparedStatement pstmt= null;
			ResultSet rs = null;;     // select문의 결과를 저장할 객체 
			
			
			try {
					
				
					String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
					String dbId    = "root";
					String dbPass  = "1234";
					
					Class.forName("com.mysql.cj.jdbc.Driver");	
			
					conn = DriverManager.getConnection(jdbcUrl,dbId,dbPass);
					
					pstmt = conn.prepareStatement("select * from member");
					rs = pstmt.executeQuery();
			%>
					<table border="1">
						<tr >
							<th>ID</th>
							<th>PW</th>
							<th>NAME</th>
							<th>DATE</th>
						</tr>
					
			
			<% 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		
					if(rs.next()){
						String id = rs.getString("ID");
						String pw = rs.getString("PASSWD");
						String name = rs.getString("NAME");
						String date = rs.getString("JOINDATE");
						
			%>
			
						<tr>
							<td><%=id %>></td>
							<td><%=pw %></td>
							<td><%=name %></td>
							<td><%=date %></td>
						</tr>
					</table>
			
	
			<%			
						
					}

					
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				rs.close();
				pstmt.close();
				conn.close();
			}
		
		%>
		
		
</body>
</html>

