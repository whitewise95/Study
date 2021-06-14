package stem2_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class boardDAO2 {
	
	private boardDAO2() {}
	public static boardDAO2 instance = new boardDAO2();
	public static boardDAO2 getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		
		try {
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/STEP3_BOARD_EX?serverTimezone=UTC";
			String dbId    = "root";
			String dbPass  = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection(jdbcUrl , dbId , dbPass);
			
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return conn;
		
	}
	
	public void boardListAdd(boardDTO2 bd ) {
		
		conn = getConnection();
		String sql = "insert into board (WRITER,EMAIL,SUBJECT,PASSWORD,REG_DATE,READ_COUNT,CONTENT) values(?,?,?,?,now(),?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bd.getWriter());
			pstmt.setString(2, bd.getEmail());
			pstmt.setString(3, bd.getPassword());
			pstmt.setString(4, bd.getSubject());
			pstmt.setDate(5, bd.getRegdate());
			pstmt.setInt(6, bd.getReadconut());
			pstmt.setString(7, bd.getContent());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
	}
	
	
	public ArrayList<boardDTO2> allshow(){
		
		ArrayList<boardDTO2> boardList = new ArrayList<boardDTO2>();
		
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement("select * from board");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				boardDTO2 bdto = new boardDTO2();
				bdto.setNum(rs.getInt("num"));
				bdto.setWriter(rs.getString("writer"));
				bdto.setEmail(rs.getString("email"));
				bdto.setSubject(rs.getString("subject"));
				bdto.setPassword(rs.getString("password"));
				bdto.setRegdate(rs.getDate("regdate"));
				bdto.setReadconut(rs.getInt("readcount"));
				bdto.setContent(rs.getString("content"));
				
				boardList.add(bdto);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)try {rs.close();} catch (SQLException e2) {e2.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			}
		
		
		
		
		
		
		
		
		
		return null;
	}
	
	
	
	
}
