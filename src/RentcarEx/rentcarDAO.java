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
	
	
}
