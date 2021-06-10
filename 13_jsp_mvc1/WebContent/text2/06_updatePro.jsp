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
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		String name =request.getParameter("name");
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;;     // select문의 결과를 저장할 객체 
		
		
		try {
				
			
				String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
				String dbId    = "root";
				String dbPass  = "1234";
				
				Class.forName("com.mysql.cj.jdbc.Driver");	
		
				conn = DriverManager.getConnection(jdbcUrl,dbId,dbPass);
				pstmt = conn.prepareStatement("select * from member where id=? and passwd=?");
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();
				
				if(rs.next()){
					pstmt = conn.prepareStatement("update member set name=? where id=? and passwd=?");
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.setString(3, pw);
					 pstmt.executeUpdate();
		
%>
				<script>
					alert("수정되었습니다.");
					location.href="00_main.jsp";
				</script>

<% 				
			}
			else{
%>
				<script>
					alert("잘못 입력하셨습니다.");
					histroy.go(-1);s
				</script>
	

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
