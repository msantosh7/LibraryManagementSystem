package com.cs425.web.dao;
import java.sql.*;
import com.cs425.web.model.Login;

public class LoginDao {
	
	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String pass = "1234";
	
	public Login checkLogin(String uId, String uPass) throws SQLException, ClassNotFoundException{
		
		
		String mySQL = "SELECT * FROM librarian WHERE librarian_id = ? and password = ?";
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		PreparedStatement pStmt = conn.prepareStatement(mySQL);
			
			pStmt.setString(1, uId);
			pStmt.setString(2, uPass);
			
			ResultSet rs = pStmt.executeQuery();
			
			Login log1 = null;
			
			if(rs.next()) {
				log1 = new Login();
				log1.setUserId(uId);
			}
			
			conn.close();
			return log1;
					
		}
			
	}
