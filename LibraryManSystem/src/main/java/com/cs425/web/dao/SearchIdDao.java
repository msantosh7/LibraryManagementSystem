package com.cs425.web.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.cs425.web.model.Document;

public class SearchIdDao {
	
	final String url = "jdbc:postgresql://localhost/libraryy";
	final String user = "postgres";
	final String pass = "1234";
	
	public List<Document> checkoverdueList() {
		
		List<Document> ld = new ArrayList<>();
		Document d1 = new Document();
		
		String mySQL = "SELECT doc_id, member_id, borrow_date, return_date FROM documents";
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(url, user, pass);
				PreparedStatement pStmt = conn.prepareStatement(mySQL)){
			
			ResultSet rs = pStmt.executeQuery();
			//System.out.println(rs.next());
			while(rs.next()) {
				//String i = rs.getString("doc_id");
				//System.out.println(i);
				/*d1.setdocumentId(rs.getString("doc_id"));
				d1.setmemberId(rs.getString("member_id"));
				d1.setborrowDate(rs.getString("borrow_date")); 
				d1.setreturndate(rs.getString("return_date"));*/
				
				String documentId = rs.getString("doc_id");
				String memberid = rs.getString("member_id");
				String borrowdate = rs.getString("borrow_date");
				String returndate = rs.getString("return_date");
				
				Document d9 = new Document(documentId,memberid,borrowdate,returndate);
				
				
				//ld.add(d1);
				ld.add(d9);
			}
			System.out.println(ld);
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
		return ld;
		
	}
	
public List<Document> searchbookId(String doc_id) {
		
		List<Document> ld = new ArrayList<>();
		Document d1 = new Document();
		
		String mySQL = "SELECT doc_id, book_name FROM books WHERE doc_id = ?";
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(url, user, pass);
				PreparedStatement pStmt = conn.prepareStatement(mySQL)){
			
			pStmt.setString(1, doc_id.trim());
			ResultSet rs = pStmt.executeQuery();
			//System.out.println(rs.next());
			while(rs.next()) {
				//String i = rs.getString("doc_id");
				//System.out.println(i);
				/*d1.setdocumentId(rs.getString("doc_id"));
				d1.setmemberId(rs.getString("member_id"));
				d1.setborrowDate(rs.getString("borrow_date")); 
				d1.setreturndate(rs.getString("return_date"));*/
				
				String documentId = rs.getString("doc_id");
				String book_name = rs.getString("book_name");
				
				Document d7 = new Document(documentId,book_name);
				
				
				//ld.add(d1);
				ld.add(d7);
			}
			System.out.println(ld);
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
		return ld;
		
	}
public List<Document> deleteBook(String doc_id) {
	
	List<Document> ld = new ArrayList<>();
	Document d1 = new Document();
	
	String mySQL = "DELETE FROM books WHERE doc_id = ?";
	
	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e1) {
		e1.printStackTrace();
	}
	try (Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pStmt = conn.prepareStatement(mySQL)){
		
		pStmt.setString(1, doc_id.trim());
		ResultSet rs = pStmt.executeQuery();
		//System.out.println(rs.next());
		//while(rs.next()) {
			//String i = rs.getString("doc_id");
			//System.out.println(i);
			/*d1.setdocumentId(rs.getString("doc_id"));
			d1.setmemberId(rs.getString("member_id"));
			d1.setborrowDate(rs.getString("borrow_date")); 
			d1.setreturndate(rs.getString("return_date"));*/
			
			/*String documentId = rs.getString("doc_id");
			String book_name = rs.getString("book_name");
			
			Document d7 = new Document(documentId,book_name);*/
			
			
			//ld.add(d1);
			//ld.add(d7);
		//}
		//System.out.println(ld);
		
	}catch (SQLException e) {
		System.out.println(e.getMessage());
	}	
	return ld;
	
}
public List<Document> deleteMember(String doc_id) {
	
	List<Document> ld = new ArrayList<>();
	Document d1 = new Document();
	
	String mySQL = "DELETE FROM members WHERE member_id = ?";
	
	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e1) {
		e1.printStackTrace();
	}
	try (Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pStmt = conn.prepareStatement(mySQL)){
		
		pStmt.setString(1, doc_id.trim());
		ResultSet rs = pStmt.executeQuery();
		//System.out.println(rs.next());
		//while(rs.next()) {
			//String i = rs.getString("doc_id");
			//System.out.println(i);
			/*d1.setdocumentId(rs.getString("doc_id"));
			d1.setmemberId(rs.getString("member_id"));
			d1.setborrowDate(rs.getString("borrow_date")); 
			d1.setreturndate(rs.getString("return_date"));*/
			
			/*String documentId = rs.getString("doc_id");
			String book_name = rs.getString("book_name");
			
			Document d7 = new Document(documentId,book_name);*/
			
			
			//ld.add(d1);
			//ld.add(d7);
		//}
		//System.out.println(ld);
		
	}catch (SQLException e) {
		System.out.println(e.getMessage());
	}	
	return ld;
	
}
	
public List<Document> searchbookTitle(String book_name) {
	
	List<Document> ld = new ArrayList<>();
	Document d1 = new Document();
	
	String mySQL = "SELECT doc_id, book_name FROM books WHERE book_name LIKE ?";
	
	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e1) {
		e1.printStackTrace();
	}
	try (Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement pStmt = conn.prepareStatement(mySQL)){
		
		pStmt.setString(1, book_name.trim());
		ResultSet rs = pStmt.executeQuery();
		//System.out.println(rs.next());
		while(rs.next()) {
			//String i = rs.getString("doc_id");
			//System.out.println(i);
			/*d1.setdocumentId(rs.getString("doc_id"));
			d1.setmemberId(rs.getString("member_id"));
			d1.setborrowDate(rs.getString("borrow_date")); 
			d1.setreturndate(rs.getString("return_date"));*/
			
			String documentId = rs.getString("doc_id");
			String book_name1 = rs.getString("book_name");
			
			Document d7 = new Document(documentId,book_name1);
			
			
			//ld.add(d1);
			ld.add(d7);
		}
		System.out.println(ld);
		
	}catch (SQLException e) {
		System.out.println(e.getMessage());
	}	
	return ld;
	
}
	
}
