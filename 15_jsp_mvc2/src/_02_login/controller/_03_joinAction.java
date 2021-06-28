package _02_login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _02_login.dao.loginDAO;
import _02_login.dto.loginDTO;


@WebServlet("/joinAction")
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		loginDTO ld = new loginDTO(id,pw,name,tel,email);
		boolean isJoin = loginDAO.getInstance().joinMember(ld);
		
		request.setAttribute("isJoin", isJoin);
		
		RequestDispatcher dis =request.getRequestDispatcher("text/03_joinAction.jsp");
		dis.forward(request, response);
	}

}
