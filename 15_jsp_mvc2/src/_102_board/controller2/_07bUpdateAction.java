package _102_board.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _102_board.dao2.boardDAO;
import _102_board.dto2.boardDTO;

/**
 * Servlet implementation class _07bUpdate
 */
@WebServlet("/_07bUpdateAction")
public class _07bUpdateAction extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		boardDTO list =new boardDTO();
		
		
		list.setNum(Integer.parseInt(request.getParameter("num")));
		list.setSubject(request.getParameter("subject"));
		list.setPassword(request.getParameter("pw"));
		list.setContent(request.getParameter("content"));
		
	
		boolean isUpdate = boardDAO.getInstance().updateBoard(list);
		
		request.setAttribute("isUpdate", isUpdate);
		
		
		
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("_02_board2/07_bUpdatePro.jsp");
		dis.forward(request, response);
	}


}
