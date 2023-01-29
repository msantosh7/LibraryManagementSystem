package com.cs425.web.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cs425.web.model.Book;
import com.cs425.web.model.Member;


public class AddUserDao {
	
	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String pass = "1234";
	
public Member addMember(String member_id, String firstname, String lastname, String password) throws SQLException, ClassNotFoundException{
		
		
		String mySQL = "INSERT INTO members (member_id,firstname, lastname, password) VALUES (?, ?, ?, ?)";
		Member m1 = new Member();
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		PreparedStatement pStmt = conn.prepareStatement(mySQL);
			
			pStmt.setString(1, member_id.trim());
			pStmt.setString(2, firstname);
			pStmt.setString(3, lastname);
			pStmt.setString(4, password);
			
			boolean rowInserted = pStmt.executeUpdate() > 0;
			
			conn.close();
			//return rowInserted;
			return m1;		
		}

}
