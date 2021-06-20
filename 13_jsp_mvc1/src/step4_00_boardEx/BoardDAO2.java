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
	
public int getAllCount(String searchKeyword , String searchWord) {
		
		int totalBoardCount = 0;
		
		try {
			conn = getConnection();
			String sql="";
			if(searchKeyword.equals("total")) {
				if(searchWord.equals("")) {
					sql="select count(*) from board";
				}
				else {
					sql="select count(*) from board ";
					sql+="where subject like '%"+searchWord+"%' or ";
					sql+="writer like '%"+searchWord+"%' "; 
				}
			}
			else {
				sql="select count(*) from board";
				sql+=" where "+ searchKeyword +" like '%" + searchWord + "%'";
			}
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				totalBoardCount = rs.getInt(1);
			}
			
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}

		return totalBoardCount;
		
}
public ArrayList<BoardDTO2> getSearchBoard(String searchKeyword, String searchWord,  int startBoardIdx, int searchCount) {

	ArrayList<BoardDTO2> vec = new ArrayList<BoardDTO2>();
	BoardDTO2 bdto = null;
	try {
		conn = getConnection();
		String sql="";
		if(searchKeyword.equals("total")) {
			if(searchWord.equals("")) {
				sql="select * from board order by ref desc, re_step limit ?,?";
			}
			else {
				sql="select * from board ";
				sql+="where subject like '%"+searchWord+"%' or ";
				sql+="writer like '%"+searchWord+"%' order by  ref desc, re_step limit ?,?"; 
			}
		}
		else {
			sql="select * from board";
			sql+=" where "+ searchKeyword +" like '%" + searchWord + "%' order by  ref desc, re_step limit ?,?";
		}
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, startBoardIdx);
		pstmt.setInt(2, searchCount);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			bdto = new BoardDTO2();
			bdto.setNum(rs.getInt(1));
			bdto.setWriter(rs.getString(2));
			bdto.setEmail(rs.getString(3));
			bdto.setSubject(rs.getString(4));
			bdto.setPassword(rs.getString(5));
			bdto.setRegDate(rs.getDate(6).toString());
			bdto.setRef(rs.getInt(7));
			bdto.setReStep(rs.getInt(8));
			bdto.setReLevel(rs.getInt(9));
			bdto.setReadCount(rs.getInt(10));
			bdto.setContent(rs.getString(11));
			vec.add(bdto);
		}
		
	} catch (Exception e) {e.printStackTrace();
	} finally {
		if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
		if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		
	}
		return vec;
}
	
	
	public void insertBoard(BoardDTO2 bd) {
		
		int num = 0;
		int ref = 0;
		try {
			conn = getConnection();
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
			pstmt = conn.prepareStatement("insert into board  values (?, ?, ?, ?, ?,now()"+",?, 1, 1, 0, ?)");
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
	

	
}