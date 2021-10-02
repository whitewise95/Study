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
 * Servlet implementation class _03_bWriterAction
 */
@WebServlet("/_03_bWriterAction")
public class _03_bWriterAction extends HttpServlet {
       
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		boardDTO bdto = new boardDTO();
		
		bdto.setWriter(request.getParameter("writer"));
		bdto.setEmail(request.getParameter("email"));
		bdto.setContent(request.getParameter("content"));
		bdto.setSubject(request.getParameter("subject"));
		bdto.setPassword(request.getParameter("password"));
		
		boardDAO.getInstance().inserBoard(bdto);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("_02_board2/03_WriterPro.jsp");
		dis.forward(request, response);
	}

}
