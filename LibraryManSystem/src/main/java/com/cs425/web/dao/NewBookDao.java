package com.cs425.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cs425.web.model.Book;

public class NewBookDao {
	
	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String pass = "1234";
	
	public Book insertBook(String documentid, String title) throws SQLException, ClassNotFoundException{
		
		String mySQL1 = "INSERT INTO documents (doc_id) VALUES (?);INSERT INTO books (doc_id, book_name) VALUES (?, ?);";
		//String mySQL = "INSERT INTO books (doc_id, book_name) VALUES (?, ?)";
		Book b1 = new Book();
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		//PreparedStatement pStmt = conn.prepareStatement(mySQL);
		PreparedStatement pStmt1 = conn.prepareStatement(mySQL1);
			
			pStmt1.setString(1, documentid);
			pStmt1.setString(2, documentid);
			//pStmt.setString(2, documenttype);
			pStmt1.setString(3, title);
			pStmt1.executeUpdate();
			//boolean rowInserted = pStmt.executeUpdate() > 0;
			
			conn.close();
			//return rowInserted;
			return b1;		
		}

}
