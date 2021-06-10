<%@page import="java.sql.DriverManager"%>
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		
		
		try {
				
			
				String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
				String dbId    = "root";
				String dbPass  = "1234";
				
				Class.forName("com.mysql.cj.jdbc.Driver");	
		
				conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
				
				pstmt = conn.prepareStatement("insert into member value(?,?,?,now())");
				pstmt.setString(1,id);
				pstmt.setString(2,pw);
				pstmt.setString(3,name);
				pstmt.executeUpdate();
				
		%>
			<script>
				alert("회원가입 되었습니다.");
				location.href="00_main.jsp";
			</script>
		<% 

			
				
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			pstmt.close();
			conn.close();
		}
	
	%>
</body>
</html>