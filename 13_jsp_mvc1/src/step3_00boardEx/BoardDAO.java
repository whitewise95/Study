package step3_00boardEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BoardDAO {

	
	private BoardDAO() {}
	public static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
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
	
	//게시글을 추가하는 DAO
	public void insertBoard(BoardDTO bdto) {
		conn = getConnection();
		String sql = "INSERT INTO BOARD (WRITER,EMAIL,SUBJECT,PASSWORD,REG_DATE,READ_COUNT,CONTENT)";
		   sql += "VALUES(?,?,?,?,now(),0,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bdto.getWriter());
			pstmt.setString(2, bdto.getEmail());
			pstmt.setString(3, bdto.getSubject());
			pstmt.setString(4, bdto.getPassword());
			pstmt.setString(5, bdto.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null) try {conn.close();}  catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	// 전체 게시글을 조회하는 DAO
	public ArrayList<BoardDTO> getAllBoard(){
		
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("selcet * from board");
			rs =pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO bdto = new BoardDTO();
				bdto.setNum(rs.getInt("num"));
				bdto.setWriter(rs.getString("writer"));
				bdto.setEmail(rs.getString("email"));
				bdto.setSubject(rs.getString("subject"));
				bdto.setPassword(rs.getString("password"));
				bdto.setReg_date(rs.getDate("reg_date"));
				bdto.setRead_count(rs.getInt("read_count"));
				bdto.setContent(rs.getString("content"));
				
				boardList.add(bdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null) try {conn.close();}  catch (SQLException e) {e.printStackTrace();}
		}
		return boardList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
