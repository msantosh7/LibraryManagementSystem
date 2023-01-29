package com.cs425.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cs425.web.model.Librarian;

public class LibrarianDao {

	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String password = "1234";
	
	public Librarian getLibrarian(String iID) {
		String mySQL = "SELECT librarian_id, firstname, lastname FROM librarian WHERE librarian_id = ?";
		
		Librarian ob1 = new Librarian();
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(url, user, password);
				
				PreparedStatement pStmt = conn.prepareStatement(mySQL)){
			
			
			pStmt.setString(1, iID.trim());
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				ob1.setID(rs.getString("librarian_id"));
				if(rs.wasNull()) {
					System.out.println(" another null");
				}
				ob1.setfirst_name(rs.getString("firstname"));
				ob1.setlast_name(rs.getString("lastname"));
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ob1;
	}

}