package com.cs425.web;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cs425.web.dao.LoginDao;
import com.cs425.web.model.Login;

import java.sql.SQLException;


/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    /**public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uId = request.getParameter("uId");
		String uPass = request.getParameter("uPass");
		
		LoginDao logDao = new LoginDao();
		
		try {
			Login log = logDao.checkLogin(uId, uPass);
			String destPage = "Login.jsp";
			
			if (log != null) {
				HttpSession session = request.getSession();
				session.setAttribute("log", log);
				destPage = "libWork.jsp";
			} /*else {
				String message = "Invalid credentials";
				request.setAttribute("message", message);
			}*/
			
			RequestDispatcher rd = request.getRequestDispatcher(destPage);
			rd.forward(request, response);
		} catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
	}

}
