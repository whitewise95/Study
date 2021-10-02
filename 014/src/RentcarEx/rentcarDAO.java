package RentcarEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




public class rentcarDAO {

	private rentcarDAO() {}
	
	public static rentcarDAO instance = new rentcarDAO();
	public static rentcarDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public Connection getConnection() {
		try {
			Context initctx = new InitialContext();
			Context envctx = (Context) initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//아이디 체크
	public boolean JoinIdCheck(memberBean mb) {
		boolean isId = false;
		conn = getConnection();
		try {
			pstmt=conn.prepareStatement("select * from member where id=?");
			pstmt.setString(1, mb.getId());
			rs = pstmt.executeQuery();
			if(!rs.next()) {
				isId = true;
			}
			
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		return isId;
	}


	
	
	
	
	//회원가입
	public boolean JoinMember(memberBean mb) {
		boolean isJoin = false;
		
		try {
			if(JoinIdCheck(mb)) {
				conn = getConnection();
				pstmt=conn.prepareStatement("insert into member values (?,?,?,?,?,?,?,?)");
				pstmt.setString(1, mb.getId());
				pstmt.setString(2, mb.getPw());
				pstmt.setString(3, mb.getEmail());
				pstmt.setString(4, mb.getTel());
				pstmt.setString(5, mb.getHobby());
				pstmt.setString(6, mb.getJob());
				pstmt.setString(7, mb.getAge());
				pstmt.setString(8, mb.getInfo());
				pstmt.executeUpdate();
				isJoin = true;
			}
			
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		return isJoin;
	}
	
	//로그인
	public memberBean loginMember(String id , String pw){
		memberBean mb = new memberBean();
		conn = getConnection();
		try {
			pstmt=conn.prepareStatement("select * from member where id=? and pw=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mb.setId(rs.getString(1));
				mb.setPw(rs.getString(2));
				mb.setEmail(rs.getString(3));
				mb.setTel(rs.getString(4));
				mb.setHobby(rs.getString(5));
				mb.setJob(rs.getString(6));
				mb.setAge(rs.getString(7));
				mb.setInfo(rs.getString(8));
			}
			
			
			
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		
		return mb;

	}
	
	//모든 렌트카
	public ArrayList<rentcarBean> allRentCar(){
		ArrayList<rentcarBean> rbList = new ArrayList<rentcarBean>();
		conn = getConnection();
		try {
			pstmt=conn.prepareStatement("select * from rentcar ");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rentcarBean rb = new rentcarBean();
				rb.setNo(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setCategory(rs.getInt(3));
				rb.setPrice(rs.getInt(4));
				rb.setUsepeople(rs.getInt(5));
				rb.setCompany(rs.getString(6));
				rb.setImg(rs.getString(7));
				rb.setInfo(rs.getString(8));
				rbList.add(rb);
			}
			
		
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		return rbList;
	}

	//한개의 렌트카
	public rentcarBean  rentCarInfo(int no) {
		rentcarBean rb = new rentcarBean();
		conn = getConnection();
		try {
			pstmt=conn.prepareStatement("select * from rentcar where no = ?");
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rb.setNo(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setCategory(rs.getInt(3));
				rb.setPrice(rs.getInt(4));
				rb.setUsepeople(rs.getInt(5));
				rb.setCompany(rs.getString(6));
				rb.setImg(rs.getString(7));
				rb.setInfo(rs.getString(8));
			}
			
		
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		return rb;
	}
	
	//렌트가 대여 리스트 업데이트
	public int rcaRreserve(carreserveBean cb ) {
		int max = 1;
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement("SELECT MAX(RESERVE_SEQ) FROM CARRESERVE ");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				max=rs.getInt(1)+1;
			}
			pstmt=conn.prepareStatement("insert into carreserve values (?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, max);
			pstmt.setInt(2, cb.getNo());
			pstmt.setString(3, cb.getId());
			pstmt.setInt(4, cb.getQty());
			pstmt.setInt(5, cb.getDday());
			pstmt.setString(6, cb.getRday());
			pstmt.setInt(7, cb.getUseIn());
			pstmt.setInt(8, cb.getUseWifi());
			pstmt.setInt(9, cb.getUseNavi());
			pstmt.setInt(10, cb.getUseSeat());
			pstmt.executeUpdate();
		
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return max;
	}
	//대여한 리스트 출력 DAO
	public ArrayList<CarViewBean> carReserceView(String id){
		conn = getConnection();
		ArrayList<CarViewBean> cbList = new ArrayList<CarViewBean>();
		CarViewBean cb =null;
		try {
			pstmt=conn.prepareStatement("select	* from rentcar R join carreserve C	on C.id=? and R.no = C.no;");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cb = new CarViewBean();
				cb.setId(rs.getString("id"));
				cb.setDday(rs.getInt("dday"));
				cb.setName(rs.getString("name"));
				cb.setImg(rs.getString("img"));
				cb.setPrice(rs.getInt("price"));
				cb.setQty(rs.getInt("qty"));
				cb.setRday(rs.getString("rday"));
				cb.setUseIn(rs.getInt("usein"));
				cb.setUseNavi(rs.getInt("usenavi"));
				cb.setUseSeat(rs.getInt("useseat"));
				cb.setUseWifi(rs.getInt("usewifi"));
				
				cbList.add(cb);
			}
		

		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		return cbList;
	}
	
	// 대여리스트 삭제 DAO
	
	public void carReserceDel(String id, String rday) {
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement("delete from carreserve where id=? and rday=?");
			pstmt.setString(1, id);
			pstmt.setString(2, rday);
			pstmt.executeUpdate();
	
		} catch (SQLException e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
	}

}
