package RentcarEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class rentcarDAO {

	private rentcarDAO() {}
	
	public static rentcarDAO instance = new rentcarDAO();
	public static rentcarDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		
		String dbURL = "jdbc:mysql://localhost:3306/rentcar?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	public boolean overlapCheck(memberBean mb) {
		conn= getConnection();
		
		return false;
	}
	
	
	public boolean joinMember(memberBean mb) {
		conn= getConnection();
		boolean isJoinMember =false;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID=? AND PW=?");
			pstmt.setString(1, mb.getId());
			pstmt.setString(2, mb.getPw());
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				pstmt = conn.prepareStatement("insert into member values(?,?,?,?,?,?,?,?)");
				pstmt.setString(1, mb.getId());
				pstmt.setString(2, mb.getPw());
				pstmt.setString(3, mb.getEmail());
				pstmt.setString(4, mb.getTel());
				pstmt.setString(5, mb.getHobby());
				pstmt.setString(6, mb.getJob());
				pstmt.setString(7, mb.getAge());
				pstmt.setString(8, mb.getInfo());
				pstmt.executeUpdate();
				isJoinMember =true;
			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();}  catch (SQLException e) {}}
		}
		return isJoinMember;
	}
	
	public boolean login(String id , String pw){
		
		boolean isLogin = false;
		
		conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE ID=? AND PW=?");
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				isLogin = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (rs != null)    {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();} catch (SQLException e) {}}
			
		}
		
		return isLogin;
		
	}
	
	public ArrayList<rentcarBean> allRentCar(){
		ArrayList<rentcarBean> rcList = new ArrayList<rentcarBean>();
		conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM rentcar");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rentcarBean rc = new rentcarBean();
				rc.setNo(rs.getInt(1));
				rc.setName(rs.getString(2));
				rc.setCategory(rs.getInt(3));
				rc.setPrice(rs.getInt(4));
				rc.setUsepeople(rs.getInt(5));
				rc.setCompany(rs.getString(6));
				rc.setImg(rs.getString(7));
				rc.setInfo(rs.getString(8));
				rcList.add(rc);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (rs != null)    {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();} catch (SQLException e) {}}
			
		}
		
		
		
		return rcList;
	}
	
	public rentcarBean oneCarInfo(int no){
		rentcarBean rc = new rentcarBean();
		conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM rentcar where no=?");
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				rc.setNo(rs.getInt(1));
				rc.setName(rs.getString(2));
				rc.setCategory(rs.getInt(3));
				rc.setPrice(rs.getInt(4));
				rc.setUsepeople(rs.getInt(5));
				rc.setCompany(rs.getString(6));
				rc.setImg(rs.getString(7));
				rc.setInfo(rs.getString(8));
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (rs != null)    {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();} catch (SQLException e) {}}
			
		}
		return rc;
	}
	
	public void reserveResult(carreserveBean rc){
		conn = getConnection();
		int size = 0;
		try {
			pstmt = conn.prepareStatement("select max(reserve_seq) from carreserve");
			rs=pstmt.executeQuery();
			if(rs.next()) {
				size = rs.getInt(1)+1;
			}
			String sql = "INSERT INTO CARRESERVE (RESERVE_SEQ, NO, ID, QTY, DDAY, RDAY, USEIN, USEWIFI, USENAVI, USESEAT) ";
			   sql += "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1, size);
			pstmt.setInt(2, rc.getNo());
			pstmt.setString(3,rc.getId());
			pstmt.setInt(4,rc.getQty());
			pstmt.setInt(5, rc.getDday());
			pstmt.setString(6, rc.getRday());
			pstmt.setInt(7, rc.getUseIn());
			pstmt.setInt(8, rc.getUseWifi());
			pstmt.setInt(9, rc.getUseNavi());
			pstmt.setInt(10, rc.getUseSeat());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (rs != null)    {try {rs.close();} catch (SQLException e) {}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {}}
			if (conn != null)  {try {conn.close();} catch (SQLException e) {}}
			
		}
	}
		
	
}
