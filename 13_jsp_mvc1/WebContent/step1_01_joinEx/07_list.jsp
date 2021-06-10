<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<% 	
		
		Connection conn         = null;
		PreparedStatement pstmt = null;
		ResultSet rs            = null; 
		
		try {
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
			String dbId    = "root";
			String dbPass  = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection(jdbcUrl , dbId , dbPass);
			
			pstmt = conn.prepareStatement("select * from member");
			
			rs = pstmt.executeQuery();
	%>
			<h2>회원 리스트</h2>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>PASSWORD</th>
					<th>NAME</th>
					<th>JOIN DATE</th>
				</tr>
	<% 
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				while (rs.next()) {
					String id       = rs.getString("id"); 		   				// rs.getString(1);
					String passwd   = rs.getString("passwd"); 	   				// rs.getString(2);
					String name     = rs.getString("name");		   				// rs.getString(3);
					String joindate = sdf.format(rs.getTimestamp("joindate"));  // rs.getTimestamp(4);
	%>
					<tr>
						<td><%=id %></td>
						<td><%=passwd %></td>
						<td><%=name %></td>
						<td><%=joindate %></td>
					</tr>
	<%
				}
	%>			
	
		
			</table>
	<% 		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
	
	%>
</body>
</html>


