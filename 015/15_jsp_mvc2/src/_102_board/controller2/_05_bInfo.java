package _102_board.controller2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _102_board.dao2.boardDAO;
import _102_board.dto2.boardDTO;

/**
 * Servlet implementation class _05_bList
 */
@WebServlet("/_05_bInfo")
public class _05_bInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("num"));
		
		boardDTO list = boardDAO.getInstance().getOneBoard(num);
		request.setAttribute("list", list);
		
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("_02_board2/05_bInfo.jsp");
		dis.forward(request, response);
	}

}
