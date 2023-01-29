package com.cs425.web.model;

public class Book {
	
	private String DocumentID;
	private String title;
	private String DocumentType;
	
	/*public Book(String DocumentID, String DocumentType, String title) {
		this.DocumentID=DocumentID;
		this.title=title;
		this.DocumentType=DocumentType;
	}*/
	
	public String getDocumentID() {
		return DocumentID;
	}
	public void setDocumentID(String documentID) {
		DocumentID = documentID;
	}
	public String getDocumentType() {
		return DocumentType;
	}
	public void setDocumentType(String documentType) {
		this.DocumentType = documentType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/*@Override
	public String toString() {
		return "book [DocumentID=" + DocumentID + ", title=" + title + ", getDocumentID()=" + getDocumentID()
				+ ", getTitle()=" + getTitle() + "]";
	}*/

}
