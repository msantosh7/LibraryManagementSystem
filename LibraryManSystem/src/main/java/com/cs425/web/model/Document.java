package com.cs425.web.model;

public class Document {
		protected String documentId;
	    protected String memberid;
	    protected String borrowdate;
	    protected String returndate;
	    protected String name;
	    
	    public Document(String documentId, String memberid, String borrowdate, String returndate) {
	    	this.documentId = documentId;
	    	this.memberid = memberid;
	    	this.borrowdate = borrowdate;
	    	this.returndate = returndate;
	    }
	    public Document() {
	    	
	    }
	    public Document(String documentId, String name) {
	    	this.documentId = documentId;
	    	this.name = name;
	    }
	    
	    
		public String getdocumentId() {
			return documentId;
		}
		public void setdocumentId(String documentid) {
			documentId = documentid;
		}
		public String getmemberId() {
			return memberid;
		}
		public void setmemberId(String memberid) {
			this.memberid = memberid;
		}
		public String getborrowDate() {
			return borrowdate;
		}
		public void setborrowDate(String borrowDate) {
			borrowdate = borrowDate;
		}
		public String getreturnDate() {
			return returndate;
		}
		public void setreturndate(String returndate) {
			this.returndate = returndate;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}