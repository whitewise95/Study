package _03_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _03_login.dao.copy.LoginDAO;
import _03_login.dto.copy.LoginDTO;

/**
 * Servlet implementation class _03_joinAction
 */
@WebServlet(name = "joinAction2", urlPatterns = { "joinAction2" })
public class _03_joinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		LoginDTO ldto = new LoginDTO();
		ldto.setId(request.getParameter("id"));
		ldto.setEmail(request.getParameter("email"));
		ldto.setPw(request.getParameter("pw"));
		ldto.setName(request.getParameter("name"));
		ldto.setTel(request.getParameter("tel"));
		
		boolean isJoin = LoginDAO.getInstance().join(ldto);
		
		request.setAttribute("isJoin", isJoin);
		
		
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("test2/03_joinAction.jsp");
		dis.forward(request, response);
	}

}
