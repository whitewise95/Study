package _02_login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import _01_login.dao.MemberDAO;
import _02_login.dto.loginDTO;

public class loginDAO {
	 private loginDAO() {}
	    private static loginDAO instance = new loginDAO();
	    public static loginDAO getInstance() {
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
	    
	    public boolean joinMember(loginDTO ld) {
	    	boolean isJoin = false;
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from member where id=?");
				pstmt.setString(1, ld.getId());
				rs=pstmt.executeQuery();
				if(!rs.next()) {
					pstmt = conn.prepareStatement("insert into member (id,pw,name,tel,email) values(?,?,?,?,?)");
					pstmt.setString(1, ld.getId());
					pstmt.setString(2, ld.getPw());
					pstmt.setString(3, ld.getName());
					pstmt.setString(4, ld.getTel());
					pstmt.setString(5, ld.getEmail());
					pstmt.executeUpdate();
					isJoin = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
			return isJoin;

	    }
	    
	    public boolean login(String id,String pw) {
	    	boolean isLogin = false;
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from member where id=? and pw=?");
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					isLogin = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    	
	    	
	    	
			return isLogin;
	    }
	    
	    public loginDTO oenIdView(String id) {
	    	loginDTO ld = null;
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from member where id=?");
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					ld = new loginDTO();
					ld.setId(rs.getString("id"));
					ld.setPw(rs.getString("pw"));
					ld.setName(rs.getString("name"));
					ld.setTel(rs.getString("tel"));
					ld.setEmail(rs.getString("email"));
					ld.setField(rs.getString("field"));
					ld.setSkill(rs.getString("skill"));
					ld.setMajor(rs.getString("major"));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    	
	    
			return ld;
	    }
	    
	    public void apply(loginDTO ld){
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("update member set FIELD=?, SKILL=?, MAJOR=? where id=?");
				pstmt.setString(1, ld.getField());
				pstmt.setString(2, ld.getSkill());
				pstmt.setString(3, ld.getMajor());
				pstmt.setString(4, ld.getId());
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    	
	    }
	    
	    public void delete(String id) {
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("delete from member where id=?");
				pstmt.setString(1, id);
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    }
	    
	    public void update(loginDTO ldto) {
	    	try {
				conn = getConnection();
				pstmt = conn.prepareStatement("update member set pw=?,name=?,tel=?,email=?, FIELD=?, SKILL=?, MAJOR=? where id=?");
				pstmt.setString(1, ldto.getPw());
				pstmt.setString(2, ldto.getName());
				pstmt.setString(3, ldto.getTel());
				pstmt.setString(4, ldto.getEmail());
				pstmt.setString(5, ldto.getField());
				pstmt.setString(6, ldto.getSkill());
				pstmt.setString(7,ldto.getMajor() );
				pstmt.setString(8,ldto.getId());
				pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
	        	if(rs != null) 	  {try {rs.close();}   catch (SQLException e) {}}
	        	if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
	            if(conn != null)  {try {conn.close();}  catch (SQLException e) {}}
	        }
	    }
	    
	    
	    
	    
	    
}
