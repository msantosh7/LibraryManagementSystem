package com.cs425.web.model;

public class Librarian {


	private String ID;
	private String first_name;
	private String last_name;
	private String password;

	
	private String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Librarian [ID=" + ID + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
}