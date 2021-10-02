package _102_board.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import _102_board.dto2.boardDTO;

public class boardDAO {
	
	private boardDAO() {}
	public static boardDAO instance = new boardDAO(){};
	public static boardDAO getInstance() {
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
    
    // 전체 게시판 불러오기
    public ArrayList<boardDTO> allBoardList(){
    	 ArrayList<boardDTO> bdtoList = new  ArrayList<boardDTO>();
    	 boardDTO bd = null;
    	 
    	 try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from board");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				bd = new boardDTO();
				bd.setNum(rs.getInt(1));
				bd.setWriter(rs.getString(2));
				bd.setEmail(rs.getString(3));
				bd.setSubject(rs.getString(4));
				bd.setPassword(rs.getString(5));
				bd.setRegdate(rs.getDate(6));
				bd.setReadcount(rs.getInt(7));
				bd.setContent(rs.getString(8));
				bdtoList.add(bd);
			}
			
		} catch (Exception e) {e.printStackTrace();
		}finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		return bdtoList;
    }
    // 게시글을 등록
    public void inserBoard(boardDTO bdto) {
    	
    	 try {
 			conn = getConnection();
 			pstmt = conn.prepareStatement("insert into board (writer,email,subject,password,reg_date,read_count,content) values (?,?,?,?,now(),0,?)");
 			pstmt.setString(1, bdto.getWriter());
 			pstmt.setString(2, bdto.getEmail());
 			pstmt.setString(3, bdto.getSubject());
 			pstmt.setString(4, bdto.getPassword());
 			pstmt.setString(5, bdto.getContent());
 			pstmt.executeUpdate();
 			
 	
 			
 		} catch (Exception e) {e.printStackTrace();
 		}finally {
 			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
 			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
 			if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
 		}
    }
    
    //한개의 게시물을 불러오는 DAO
    public boardDTO getOneBoard(int num) {
    	boardDTO bd =null;
    	try {
			conn = getConnection();
			pstmt=conn.prepareStatement("update board set read_count=read_count+1 where num=?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("select * from board where num=? ");
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bd = new boardDTO();
				bd.setNum(rs.getInt("num"));
				bd.setWriter(rs.getString("writer"));
				bd.setEmail(rs.getString("email"));
				bd.setPassword(rs.getString("password"));
				bd.setReadcount(rs.getInt("read_count"));
				bd.setRegdate(rs.getDate("reg_date"));
				bd.setContent(rs.getString("content"));
				bd.setSubject(rs.getString("subject"));
				
			}
			
		} catch (Exception e) {e.printStackTrace();
		}finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
    	
    	
		return bd;
    }
    //패스워드 체크 DAO
    public boolean  passwordChecked(boardDTO list) {
    	 boolean isChecked = false;
     		try {
 			conn = getConnection();
 			pstmt=conn.prepareStatement("select * from board where num=? and password=?");
 			pstmt.setInt(1, list.getNum());
 			pstmt.setString(2, list.getPassword());
 			rs = pstmt.executeQuery();
 			if(rs.next()) {
 				 isChecked = true;
 			}
 			
 		} catch (Exception e) {e.printStackTrace();
 		}finally {
 			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
 			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
 			if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
 		}
		return isChecked;
    }
    
    
    
    //게시물 업데이트 DAO
   public boolean  updateBoard(boardDTO list) {
	   boolean isUpdate = false;
	   try {
			if(passwordChecked(list)) { 
				conn = getConnection();  //conn 주의하자! 패스워드체크DAO에서 conn.close했기에  if문안에 넣어줘야함
				pstmt=conn.prepareStatement("update board set subject=?, content=? where num=?");
				pstmt.setString(1, list.getSubject());
				pstmt.setString(2, list.getContent());
				pstmt.setInt(3, list.getNum());
				pstmt.executeUpdate();
				isUpdate = true;
			}
				
			} catch (Exception e) {e.printStackTrace();
			}finally {
				if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
				if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
	  }
	   return isUpdate;
   }
   
   //게시글을 삭제하는 DAO
   public boolean  deleteBoard(boardDTO list) {
	   boolean isDelete = false;
	   try {
			if(passwordChecked(list)) { 
				conn = getConnection();  
				pstmt=conn.prepareStatement("delete from board where num=?");
				pstmt.setInt(1, list.getNum());
				pstmt.executeUpdate();
				isDelete = true;
			}
				
			} catch (Exception e) {e.printStackTrace();
			}finally {
				if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
				if(conn!=null)try {	conn.close();} catch (SQLException e) {e.printStackTrace();}
	  }
	   return isDelete;
   }
}
