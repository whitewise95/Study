package step2_00_loginEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO(Date Access Object) :  데이터 접근 객체 
public class MemberDAO {
	
	// SingleTon 패턴 
	
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
			return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//반환 타입은 Connection객체이며 메서드명은  관용적으로 getConnection으로 작성한다.
	public Connection getConnection() {
		
		try {
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/login_ex?serverTimezone=UTC";
			String dbId    = "root";
			String dbPass  = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			conn = DriverManager.getConnection(jdbcUrl , dbId , dbPass);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
			return conn;
	}
	
	// Join DAO
	public boolean insertMember(MemberDTO mdto) {
		
		boolean isFirstMember = false;
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1, mdto.getId());
			
			rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				pstmt = conn.prepareStatement("insert into member values(?,?,?,now())");
				pstmt.setString(1, mdto.getId());
				pstmt.setString(2, mdto.getPassword());
				pstmt.setString(3, mdto.getName());
				pstmt.executeUpdate();
				isFirstMember = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs    != null) try {rs.close();}    catch (SQLException e) {e.printStackTrace();}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn  != null) try {conn.close();}  catch (SQLException e) {e.printStackTrace();}
		}
		
		
		
		
		return isFirstMember;
	}
	
	// loginDAO
	public boolean login(String id , String password) {
		
		boolean isValidMember = false;
		
		try {
			
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from member where id=? and passwd=?");
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				isValidMember = true;
			}
			
		}catch(Exception e){
			e.printStackTrace();		
		}finally {
			if(rs    != null) try {rs.close();}    catch (SQLException e) {e.printStackTrace();}
			if(pstmt != null) try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn  != null) try {conn.close();}  catch (SQLException e) {e.printStackTrace();}
		}
		
		
		
		return isValidMember;
	}
	

	
	
	
	
	
	
	
	
	
	

}
