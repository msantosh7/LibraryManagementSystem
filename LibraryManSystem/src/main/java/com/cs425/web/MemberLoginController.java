package com.cs425.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cs425.web.dao.MemberDAO;
import com.cs425.web.model.Member;

import java.sql.SQLException;



/**
 * Servlet implementation class LoginController
 */
public class MemberLoginController extends HttpServlet {
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
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uId = request.getParameter("uId");
		String uPass = request.getParameter("uPass");
		
		MemberDAO logDao = new MemberDAO();
		
		try {
			Member log = logDao.checkLogin(uId, uPass);
			String destPage = "MemberLogin.jsp";
			
			if (log != null) {
				HttpSession session = request.getSession();
				session.setAttribute("log", log);
				destPage = "memWork.jsp";
			}
//			} else {
//				String message = "Invalid credentials";
//				request.setAttribute("message", message);
//			}
			
			RequestDispatcher rd = request.getRequestDispatcher(destPage);
			rd.forward(request, response);
		} catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
	}

}