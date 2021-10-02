package stem2_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private DAO() {}
	
	private static DAO instance = new DAO();
	public static DAO getInstance() {
		return instance;
		
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		
		try {
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
			String dbId    = "root";
			String dbPass  = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection(jdbcUrl , dbId , dbPass);
			
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return conn;
		
	}
	
	public boolean insert(DTO member) {
		
		boolean insert =false;
		
		try {
			conn = getConnection();
			pstmt= conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1, member.getId());
			rs = pstmt.executeQuery();
			
			
			if(!rs.next()) {
				pstmt= conn.prepareStatement("insert into member values(?,?,?,now())");
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPw());
				pstmt.setString(3, member.getName());
				pstmt.executeUpdate();
				insert  = true;
			}
			
		} catch (Exception e) {e.printStackTrace();}finally {
			try {rs.close();} catch (Exception e) {e.printStackTrace();}
			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {conn.close();} catch (Exception e) {e.printStackTrace();}
		}
		
		return insert;
	}
	
	
	public boolean Login(String id , String pw) {
		
		boolean isLogin =false;
		
		conn=getConnection();
		try {
			pstmt = conn.prepareStatement("select * from member where id=? and passwd=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs =pstmt.executeQuery();
			
			if(rs.next()) {
				isLogin =true;
			}
			
		
		
		} catch (Exception e) {e.printStackTrace();}finally {
			try {rs.close();} catch (Exception e) {e.printStackTrace();}
			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {conn.close();} catch (Exception e) {e.printStackTrace();}
			
		}
		
		return isLogin;
	}
	

	
	
	
	
	
	
}
