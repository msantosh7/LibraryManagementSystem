package com.cs425.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs425.web.dao.LibrarianDao;
import com.cs425.web.model.Librarian;


public class GetInformationController extends HttpServlet {

	/*
	 * private static final long serialVersionUID = 1L;
    //*
     *
     * @see HttpServlet#HttpServlet()
     // 
     *public GetInformationController() {super(); // TODO Auto-generated 
     *constructor stub }
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String ID = request.getParameter("iID").toString();
		
		LibrarianDao od1 = new LibrarianDao();
		Librarian ob1 = od1.getLibrarian(ID);
		
		request.setAttribute("Librarian",ob1);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowLibrarian.jsp");
		rd.forward(request, response);
		
	}

	/* //*
	 		* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
	 		* 	response)
	 //
	 *protected void doPost(HttpServletRequest request, HttpServletResponse 
	 *response) throws ServletException, IOException {// TODO Auto-generated 
	 *method stub doGet(request, response); }
	 */

}