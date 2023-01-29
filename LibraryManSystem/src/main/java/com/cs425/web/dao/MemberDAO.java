package com.cs425.web.dao;

import java.sql.*;
import com.cs425.web.model.Member;

public class MemberDAO {
	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String pass = "1234";
	
	public Member checkLogin(String uId, String uPass) throws SQLException, ClassNotFoundException{
		
		String mySQL = "SELECT * FROM members WHERE member_id = ? and password = ?";
		
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
			
			Member log1 = null;
			
			if(rs.next()) {
				log1 = new Member();
				log1.setUserId(uId);
			}
			
			conn.close();
			return log1;
		}
	
}
