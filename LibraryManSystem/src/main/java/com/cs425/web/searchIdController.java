package com.cs425.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cs425.web.dao.SearchIdDao;
import com.cs425.web.model.Book;
import com.cs425.web.model.Document;

/**
 * Servlet implementation class searchIdController
 */
public class searchIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
//	Document d1 = new Document();
	
	//private SearchIdDao srchDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public searchIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		
		
		try {
			switch (action) {
			case "/newbook":
				newBook(request,response);
				break;
			case "/searchidController":
				searchBookId(request,response);
				break;
			case "/checkoverdue":
				checkOverdue(request,response);
				break;
			case "/addmember":
				addUser(request,response);
				break;
			case "/searchtitleController":
				searchBookTitle(request,response);
				break;
			case "/deleteidController":
				deleteBook(request,response);
				break;
			case "/deletenewbook":
				deletenewBook(request,response);
				break;
			case "/deletemember":
				deletenewMember(request,response);
				break;
			case "/deleteuserController":
				deleteMember(request,response);
				break;
			}
		}catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
	}
	
	private void newBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		RequestDispatcher rd = request.getRequestDispatcher("newbook.jsp");
		rd.forward(request, response);
		
	}
	private void searchBookId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		String ID = request.getParameter("bookId").toString();
		
		
		SearchIdDao srchDao = new SearchIdDao();
		List<Document> bookResult = srchDao.searchbookId(ID);
		request.setAttribute("bookResult", bookResult);
		RequestDispatcher rd = request.getRequestDispatcher("searchbook.jsp");
		rd.forward(request, response);
		
	}
private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		String ID = request.getParameter("delete_id").toString();
		
		
		SearchIdDao srchDao = new SearchIdDao();
		List<Document> bookResult = srchDao.deleteBook(ID);
		//request.setAttribute("bookResult", bookResult);
		RequestDispatcher rd = request.getRequestDispatcher("libWork.jsp");
		rd.forward(request, response);
		
	}
private void deleteMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	
	String ID = request.getParameter("deletememberid").toString();
	
	
	SearchIdDao srchDao = new SearchIdDao();
	List<Document> bookResult = srchDao.deleteMember(ID);
	//request.setAttribute("bookResult", bookResult);
	RequestDispatcher rd = request.getRequestDispatcher("libWork.jsp");
	rd.forward(request, response);
	
}
private void deletenewMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	RequestDispatcher rd = request.getRequestDispatcher("deletemember.jsp");
	rd.forward(request, response);
	
}
private void deletenewBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	RequestDispatcher rd = request.getRequestDispatcher("deletebook.jsp");
	rd.forward(request, response);
	
}
	private void searchBookTitle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		String ID = request.getParameter("bookTitle").toString();
		
		
		SearchIdDao srchDao = new SearchIdDao();
		List<Document> bookResult = srchDao.searchbookTitle(ID);
		request.setAttribute("bookResult", bookResult);
		RequestDispatcher rd = request.getRequestDispatcher("newsearch.jsp");
		rd.forward(request, response);
		
	}
	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		RequestDispatcher rd = request.getRequestDispatcher("addUser.jsp");
		rd.forward(request, response);
		
	}
	private void checkOverdue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SearchIdDao srchDao = new SearchIdDao();
		List<Document> overdueList = srchDao.checkoverdueList();
		System.out.println(overdueList);
		
		request.setAttribute("overdueList", overdueList);
		//System.out.println(ld);
		//request.setAttribute("due", ld);
		
		RequestDispatcher rd = request.getRequestDispatcher("checkoverdue.jsp");
		rd.forward(request, response);
	}

}
