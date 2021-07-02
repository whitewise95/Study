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
 * Servlet implementation class _09bDeleteAction
 */
@WebServlet("/_09bDeleteAction")
public class _09bDeleteAction extends HttpServlet {
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
		list.setPassword(request.getParameter("pw"));
		
	
		boolean isDelete = boardDAO.getInstance().deleteBoard(list);
		
		request.setAttribute("isDelete", isDelete);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("_02_board2/09_bUpdatePro.jsp");
		dis.forward(request, response);
	}


}
