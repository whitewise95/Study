package _09_sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		 
		 request.setCharacterEncoding("utf-8");
		 String id = request.getParameter("id");
		 
		 //세션 생성하는 방법
		 HttpSession session = request.getSession();
		 session.setAttribute("id", id);
		 
		 RequestDispatcher dis = request.getRequestDispatcher("chapter09_servlet/04_loginAction.jsp");
		 dis.forward(request, response);
		 
		 

		 
		 
	}

}
