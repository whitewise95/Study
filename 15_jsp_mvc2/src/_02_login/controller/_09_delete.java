package _02_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import _02_login.dao.loginDAO;

/**
 * Servlet implementation class _09_delete
 */
@WebServlet("/delete")
public class _09_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id =(String)session.getAttribute("mid");
		loginDAO.getInstance().delete(id);
		
		
		
		session.invalidate();
		RequestDispatcher dis = request.getRequestDispatcher("text/09_delete.jsp");
		dis.forward(request, response);
	}

}

