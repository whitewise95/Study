package _02_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import _02_login.dao.loginDAO;


@WebServlet("/loginAction")
public class _05_loginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);  //안써서 틀림
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean isLogin = loginDAO.getInstance().login(id,pw);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("mid", id);
		
			
		}
		request.setAttribute("isLogin", isLogin);
		
		RequestDispatcher dis = request.getRequestDispatcher("text/05_loginAction.jsp");
		dis.forward(request, response);
	}

}
