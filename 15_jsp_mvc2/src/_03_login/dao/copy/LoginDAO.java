package _03_login.dao.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import _01_login.dao.MemberDAO;
import _02_login.dto.loginDTO;
import _03_login.dto.copy.LoginDTO;

public class LoginDAO {
	 private LoginDAO() {}
	    private static LoginDAO instance = new LoginDAO();
	    public static LoginDAO getInstance() {
	        return instance;
	    }
	    
	    Connection conn 		= null;
	    PreparedStatement pstmt = null;
	    ResultSet rs 			= null;
	    
	    public Connection getConnection() throws Exception {
	        
	        Context initCtx = new InitialContext();
	        // lookup 메서드를 통해
	        // server.xml 파일에 접근하여 자바환경 코드를 검색
	        Context envCtx = (Context)initCtx.lookup("java:comp/env");
	        // <Context>태그안의 <Resource> 환경설정의
	        // name이 jdbc/pool인 것을 검색
	        DataSource ds = (DataSource)envCtx.lookup("jdbc/pool");
	        conn = ds.getConnection();
	        
	        return conn;
	        
	    }
	    
	    public boolean join(LoginDTO db) {
	    	boolean isJoin = false;
	    	try {
				conn = getConnection();
				pstmt= conn.prepareStatement("select * from member where  id = ?");
				pstmt.setString(1, db.getId());
				rs=pstmt.executeQuery();
				if(!rs.next()) {
					pstmt= conn.prepareStatement("insert into member (id,pw,name,tel,emal) values (?,?,?,?,?)");
					pstmt.setString(1, db.getId());
					pstmt.setString(2, db.getPw());
					pstmt.setString(3, db.getName());
					pstmt.setString(4, db.getTel());
					pstmt.setString(5, db.getEmail());
					pstmt.executeUpdate();
					isJoin = true;
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    	
	    	
			return isJoin;
	    }
	    
}
