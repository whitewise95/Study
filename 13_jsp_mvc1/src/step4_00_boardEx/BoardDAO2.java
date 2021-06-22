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
	
	public int getAllCount(String searchKeyword, String keyword) {
		int totBoardCount = 1;
		try {
			conn = getConnection();
			String sql = "";
			if(searchKeyword.equals("total")) {
				if(keyword.equals("")) {
					sql="select count(*) from board";
				}
				else {
					sql="select count(*) from board";
					sql+= "where subject like '%"+keyword+"%' or ";
					sql+="writer like '%"+keyword+"%'";
				}
			}
			else {
				sql="select count(*) from board where "+searchKeyword+" like '%"+keyword+"%'";
			}
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				totBoardCount = rs.getInt(1);
			}
			
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		return totBoardCount;
	}
	
		public ArrayList<BoardDTO2> getAllBoardList(String keyword, String searchKeyword, int onePageViewCount, int startBoardIdx){
			ArrayList<BoardDTO2> bd = new ArrayList<BoardDTO2>(); 
			try {
				conn = getConnection();
				String sql = "";
				if(searchKeyword.equals("total")) {
					if(keyword.equals("")) {
						sql="select * from board";
						sql+=" order by ref desc, re_step limit ?,?";
					}
					else {
						sql="select * from board";
						sql+= "where subject like '%"+keyword+"%' or ";
						sql+="writer like '%"+keyword+"%'";
						sql+=" order by ref desc, re_step limit ?,?";
					}
				}
				else {
					sql="select * from board where "+searchKeyword+" like '%"+keyword+"%'";
					sql+=" order by ref desc, re_step limit ?,?";
				}
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, startBoardIdx);
				pstmt.setInt(2, onePageViewCount);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					BoardDTO2 bdto = new BoardDTO2();
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
					bd.add(bdto);
				}
	
				
			} catch (Exception e) {e.printStackTrace();
			} finally {
				if(rs!=null)try {rs.close();} catch (Exception e) {e.printStackTrace();}
				if(pstmt!=null)try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
				if(conn!=null)try {conn.close();} catch (Exception e) {e.printStackTrace();}
				
			}
			
			return bd;
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
	
	public BoardDTO2 oneBoardList(int num) {
		BoardDTO2 bd = new BoardDTO2();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("update board set read_count=read_count+1 where num=?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("select * from board where num=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bd.setNum(rs.getInt(1));
				bd.setWriter(rs.getString(2));
				bd.setEmail(rs.getString(3));
				bd.setSubject(rs.getString(4));
				bd.setPassword(rs.getString(5));
				bd.setRegDate(rs.getString(6));
				bd.setRef(rs.getInt(7));
				bd.setReStep(rs.getInt(8));
				bd.setReLevel(rs.getInt(9));
				bd.setReadCount(rs.getInt(10));
				bd.setContent(rs.getString(11));
			}
			
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		return bd;
	}  
	
	public boolean passwordChecked(BoardDTO2 bd) {
		boolean isPassword = false;
		try {
			conn = getConnection();
			pstmt= conn.prepareStatement("select * from board where num=? and password=?");
			pstmt.setInt(1, bd.getNum());
			pstmt.setString(2,bd.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				isPassword = true;
			}
			
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return isPassword;
	}
	
	
	public boolean updateBoard(BoardDTO2 bd) {
		boolean isUpdate = false;
		try {
			if(passwordChecked(bd)) {
				conn = getConnection();
				pstmt= conn.prepareStatement("update board set subject=?, content=? where num=?");
				pstmt.setString(1, bd.getSubject());
				pstmt.setString(2, bd.getContent());
				pstmt.setInt(3, bd.getNum());
				pstmt.executeUpdate();
				System.out.println("board테이블이 업데이트 되었습니다.");
				System.out.println(bd.getNum() + "/" + bd.getWriter() + "/" + bd.getSubject());
				isUpdate = true;
			}
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		
		
		return isUpdate;
	}
	
	public boolean deleteBoard(BoardDTO2 bd) {
		boolean isDelete = false;
		try {
			if(passwordChecked(bd)) {
				conn = getConnection();
				pstmt= conn.prepareStatement("delete from board where num=?");
				pstmt.setInt(1, bd.getNum());
				pstmt.executeUpdate();
				isDelete = true;
			}
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return isDelete;
	}
	
	public void reWriteBoard(BoardDTO2 bd) {
		int num = 0;
		int ref     = bd.getRef();
		int restep  = bd.getReStep();
		int relevel = bd.getReLevel();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();
			if(rs.next()) {
			num = rs.getInt(1)+1;
			}
			pstmt = conn.prepareStatement("UPDATE BOARD SET RE_STEP=RE_STEP+1 WHERE REF=? and RE_STEP > ?");
			pstmt.setInt(1, ref);
			pstmt.setInt(2, restep);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement("insert into board  values (?, ?, ?, ?, ?,now()"+",?, ?, ?, 0, ?)");
			pstmt.setInt(1,num);
			pstmt.setString(2, bd.getWriter());
			pstmt.setString(3, bd.getEmail());
			pstmt.setString(4, bd.getSubject());
			pstmt.setString(5, bd.getPassword());
			pstmt.setInt(6, ref);
			pstmt.setInt(7, restep+1);
			pstmt.setInt(8, relevel+1);
			pstmt.setString(9, bd.getContent());
			pstmt.executeUpdate();
	
		} catch (Exception e) {e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if(pstmt!=null)try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
			if(conn!=null)try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	
	
	

	
}