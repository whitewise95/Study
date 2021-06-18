package step4_00_boardEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO2 {
	
	private BoardDAO2() {}
	private static BoardDAO2 instance = new BoardDAO2();
	public static BoardDAO2 getInstance() {
		return instance;
	}


	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Connection getConnection() {
		
		String dbURL 	  = "jdbc:mysql://localhost:3306/STEP4_BOARD_EX?serverTimezone=UTC";
		String dbID 	  = "root";
		String dbPassword = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public void insertBoard(BoardDTO2 bd) {
		conn = getConnection();
		int num = 0;
		int ref = 0;
		try {
			pstmt = conn.prepareStatement("select max(ref) from board");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ref = rs.getInt(1)+1;
			}
			pstmt = conn.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();
			if(rs.next()) {
			num = rs.getInt(1)+1;
			}
			pstmt = conn.prepareStatement("insert into board values (?,?,?,?,?,now(),?,1,1,0,?)");
			pstmt.setInt(1,num);
			pstmt.setString(2, bd.getWriter());
			pstmt.setString(3, bd.getEmail());
			pstmt.setString(4, bd.getSubject());
			pstmt.setString(5, bd.getPassword());
			pstmt.setInt(6, ref);
			pstmt.setString(7, bd.getContent());
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
	}
	
	public ArrayList<BoardDTO2> allBoardList(BoardDTO2 bd){
		
	}
	
	
	
}